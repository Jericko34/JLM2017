/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveurjeu;

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

    public void play(int a, int b, String c) {
        Chronometre.getInstance().start();
        if (Partie.getInstance().isJoueurAllowed(c) != true) {
            System.out.println("va chier");
        } else if (Chronometre.getInstance().stop()>10) {System.out.println("Fuck off");
        } else if (Partie.getInstance().positionner(a, b, c) == 1) {
            System.out.println("OK");
        } else System.out.println("Pas bon");
    }
}
