/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveurjeu;

import MesDTOs.PlayDTO;

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
        } else {
            switch (Partie.getInstance().positionner(a, b, c)) {
                case 1:
                    return new PlayDTO(200);
                default:
                    return new PlayDTO(406);

            }
        }
    }

}
