/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveurjeu;

import MesDTOs.PlayDTO;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Benjamin
 */
public class AdapteurPlay {

    private static AdapteurPlay INSTANCE = null;

    private AdapteurPlay() {
    }

    public static AdapteurPlay getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AdapteurPlay();
        }
        return INSTANCE;
    }

    public PlayDTO play(int a, int b, String c) {
        if (Partie.getInstance().getJoueurencours().getIdJoueur() != Partie.getInstance().getjoueurfromid(c).getIdJoueur()) {
            return new PlayDTO(401);
        } else if (Chronometre.getInstance().stop() > 10) {
            Chronometre.getInstance().reset();
            Partie.getInstance().setGagnant(true);
            Partie.getInstance().setGagne(Partie.getInstance().getAutreJoueur());
            return new PlayDTO(406);
        } else {
            Chronometre.getInstance().reset();
            switch (Partie.getInstance().positionner(a, b, c)) {
                case 1:
                    Chronometre.getInstance().start();
                    return new PlayDTO(200);
                default:
                    Chronometre.getInstance().start();
                    return new PlayDTO(406);

            }
        }
    }

    private void waitten() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
    }

}
