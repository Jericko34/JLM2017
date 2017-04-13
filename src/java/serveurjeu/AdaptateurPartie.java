/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveurjeu;

import MesDTOs.InfoPartieDTO;

/**
 *
 * @author Khaderik
 */
public class AdaptateurPartie {

    private static AdaptateurPartie INSTANCE = null;

    private AdaptateurPartie() {
    }
    
    public InfoPartieDTO getInfoPartie() {
        return new InfoPartieDTO(Partie.getInstance().getJoueur1(), Partie.getInstance().getJoueur2(),Partie.getInstance().getTableau());
    }

    public static AdaptateurPartie getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AdaptateurPartie();
        }
        return INSTANCE;
    }
}
