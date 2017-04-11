/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveurjeu;

public class Joueur {

    private String joueurName;
    private String idJoueur;
    private int numJoueur;

    public Joueur(String a) {
        this.joueurName = a;
        this.idJoueur = generateId();
    }

    private String generateId() {
        String a="";
        return a;
    }

}
