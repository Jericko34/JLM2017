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
public class Partie {

    private Joueur joueur1;
    private Joueur joueur2;
    private int tableau[][];

    public Partie() {
        tableau = new int[19][19];
    }

    public int ajouterJoueur(String a) {
        if (joueur1 == null) {
            joueur1 = new Joueur(a, 1);
            return 1;
        } else if (joueur2 == null) {
            joueur2 = new Joueur(a, 2);
            return 1;
        } else {
            return 0;
        }
    }

    public int positionner(int a, int b, String c) {
        if (tableau[a][b] == 0) {
            int val = getJoueurNum(c);
            tableau[a][b] = val;
            return 1;
        } else {
            return 0;
        }
    }

    public void testVictoireLigne() {
        int compteur = 0;
        for (int i = 0; i > 18; i++) {
            for (int j = 0; j > 18; j++) {
                                
            }
        }
    }

    private int getJoueurNum(String a) {
        if (joueur1.getIdJoueur() == a) {
            return 1;
        } else if (joueur2.getIdJoueur() == a) {
            return 2;
        } else {
            return 0;
        }
    }
}
