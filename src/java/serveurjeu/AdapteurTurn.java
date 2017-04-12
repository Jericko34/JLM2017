/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveurjeu;

import MesDTOs.TurnDTO;

/**
 *
 * @author Benjamin
 */
public class AdapteurTurn {

    private static AdapteurTurn INSTANCE = null;

    private AdapteurTurn() {
    }

    public TurnDTO demandertours(String a) {
        if (Partie.getInstance().getJoueurencours().getIdJoueur() != a) {
            return new TurnDTO(0, Partie.getInstance().getTableau(), Partie.getInstance().getJoueur1().getNbreTenaille(), Partie.getInstance().getJoueur2().getNbreTenaille(), Partie.getInstance().getDernierCoupX(), Partie.getInstance().getDernierCoupY(), Partie.getInstance().isProlongation(), Partie.getInstance().isGagnant(), a, Partie.getInstance().getNumTour(), 401);
        } else {return new TurnDTO(0, Partie.getInstance().getTableau(), Partie.getInstance().getJoueur1().getNbreTenaille(), Partie.getInstance().getJoueur2().getNbreTenaille(), Partie.getInstance().getDernierCoupX(), Partie.getInstance().getDernierCoupY(), Partie.getInstance().isProlongation(), Partie.getInstance().isGagnant(), a, Partie.getInstance().getNumTour(), 200);
        }
    }

    public static AdapteurTurn getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AdapteurTurn();
        }
        return INSTANCE;
    }
}
