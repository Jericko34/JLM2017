/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveurjeu;

import objetjson.connect;

/**
 *
 * @author Benjamin
 */
public class AdaptateurConnection {

    private static AdaptateurConnection INSTANCE = null;

    private AdaptateurConnection() {
    }

    private connect ajouterunjoueur(String a) {
        switch (Partie.getInstance().ajouterJoueur(a)) {
            case 1:
                return new connect(Partie.getInstance().getJoueur1().getIdJoueur(), 200, a, Partie.getInstance().getJoueur1().getNumJoueur());
            case 2:
                return new connect(Partie.getInstance().getJoueur2().getIdJoueur(), 200, a, Partie.getInstance().getJoueur2().getNumJoueur());
            default:
                return new connect("", 401, a, 0);
        }
    }

    public static AdaptateurConnection getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AdaptateurConnection();
        }
        return INSTANCE;
    }
}
