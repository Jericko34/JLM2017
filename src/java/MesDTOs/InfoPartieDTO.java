/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MesDTOs;

import serveurjeu.Joueur;

/**
 *
 * @author Khaderik
 */
public class InfoPartieDTO {

    private Joueur joueur1;
    private Joueur joueur2;
    private int tableau[][];

    public InfoPartieDTO() {
    }

    public InfoPartieDTO(Joueur j1, Joueur j2, int[][] plateau) {
        this.joueur1 = j1;
        this.joueur2 = j2;
        this.tableau = plateau;
    }

    /**
     * @return the joueur1
     */
    public Joueur getJoueur1() {
        return joueur1;
    }

    /**
     * @param joueur1 the joueur1 to set
     */
    public void setJoueur1(Joueur joueur1) {
        this.joueur1 = joueur1;
    }

    /**
     * @return the joueur2
     */
    public Joueur getJoueur2() {
        return joueur2;
    }

    /**
     * @param joueur2 the joueur2 to set
     */
    public void setJoueur2(Joueur joueur2) {
        this.joueur2 = joueur2;
    }

    /**
     * @return the tableau
     */
    public int[][] getTableau() {
        return tableau;
    }

    /**
     * @param tableau the tableau to set
     */
    public void setTableau(int[][] tableau) {
        this.tableau = tableau;
    }
}
