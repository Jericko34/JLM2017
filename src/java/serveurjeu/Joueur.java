/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveurjeu;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Joueur {

    private String joueurName;
    private String idJoueur;
    private int numJoueur;

    public Joueur(String a, int b) {
        this.joueurName = a;
        this.idJoueur = generateId();
        this.numJoueur = b;
    }

    private String generateId() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }

    public String getJoueurName() {
        return joueurName;
    }

    public void setJoueurName(String joueurName) {
        this.joueurName = joueurName;
    }

    public String getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(String idJoueur) {
        this.idJoueur = idJoueur;
    }

    public int getNumJoueur() {
        return numJoueur;
    }

    public void setNumJoueur(int numJoueur) {
        this.numJoueur = numJoueur;
    }
    
}
