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
    private boolean gagnant;
    private Joueur gagne;
    private int ligne;
    private int colone;

    public Partie() {
        tableau = new int[19][19];
        gagnant = false;
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
            this.ligne=a;
            this.colone=b;
            return 1;
        } else {
            return 0;
        }
    }

    public void testTenaille() {
    }

    public void testVictoireTenaille() {
        if (joueur1.getNbreTenaille() == 5) {
            gagne = joueur1;
            gagnant = true;
        }
        if (joueur2.getNbreTenaille() == 5) {
            gagne = joueur2;
            gagnant = true;
        }
    }

    public void testVictoireLigne() {
        int compteur = 0;
        //Test Ligne
        if (gagnant == false) {
            for (int i = 0; i < 18; i++) {
                for (int j = 0; j < 17; j++) {
                    if (tableau[i][j] == tableau[i][j + 1]) {
                        compteur++;
                        if (compteur == 5) {
                            gagnant = true;
                            break;
                        }
                    } else {
                        compteur = 0;
                    }
                }
            }
        }
        //Test Colone
        if (gagnant == false) {
            for (int i = 0; i < 18; i++) {
                for (int j = 0; j < 17; j++) {
                    if (tableau[j][i] == tableau[j][i + 1]) {
                        compteur++;
                        if (compteur == 5) {
                            gagnant = true;
                            break;
                        }
                    } else {
                        compteur = 0;
                    }
                }
            }
        }
        //Test Diagonales
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
