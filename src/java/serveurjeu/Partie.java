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
    private static Partie INSTANCE = null;
    private int nbCoup = 0;
    private Chronometre chrono;
    private Joueur joueurencours;
    private int dernierCoupX;
    private int dernierCoupY;
    private boolean prolongation;
    private int numTour = 0;
    private int aquiletours;
    private boolean debutdepartie;

    private Partie() {
        tableau = new int[19][19];
        gagnant = false;
        joueurencours = new Joueur("test", 5);
        aquiletours = 0;
        debutdepartie = false;
        prolongation = false;
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
            this.ligne = a;
            this.colone = b;
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
        compteur = 0;
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
        //Test Diagonale
        if (gagnant == false) {
            for (int z = -4; z < 0; z++) {
                if (tableau[dernierCoupX - z][dernierCoupY - z] == tableau[dernierCoupX - z + 1][dernierCoupY - z + 1] || tableau[dernierCoupX - z + 1][dernierCoupY - z + 1] == tableau[dernierCoupX - z + 2][dernierCoupY - z + 2] || tableau[dernierCoupX - z + 2][dernierCoupY - z + 2] == tableau[dernierCoupX - z + 3][dernierCoupY - z + 3] || tableau[dernierCoupX - z + 3][dernierCoupY - z + 3] == tableau[dernierCoupX - z + 4][dernierCoupY - z + 4]) {
                    this.gagnant = true;
                    this.gagne = this.joueurencours;
                    break;
                }
            }
            for (int z = -4; z < 0; z++) {
                if (tableau[dernierCoupX - z][dernierCoupY - z] == tableau[dernierCoupX - z + 1][dernierCoupY - z + 1] || tableau[dernierCoupX - z + 1][dernierCoupY - z + 1] == tableau[dernierCoupX - z + 2][dernierCoupY - z + 2] || tableau[dernierCoupX - z + 2][dernierCoupY - z + 2] == tableau[dernierCoupX - z + 3][dernierCoupY - z + 3] || tableau[dernierCoupX - z + 3][dernierCoupY - z + 3] == tableau[dernierCoupX - z + 4][dernierCoupY - z + 4]) {
                }
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

    public Joueur getjoueurfromid(String a) {
        if (joueur1.getIdJoueur() == a) {
            return joueur1;
        } else if (joueur2.getIdJoueur() == a) {
            return joueur2;
        } else {
            return null;
        }
    }

    public boolean isJoueurAllowed(String a) {
        if (joueur1.getIdJoueur() == a || joueur2.getIdJoueur() == a) {
            return true;
        } else {
            return false;
        }
    }

    public static Partie getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Partie();
        }
        return INSTANCE;
    }

    public Joueur getJoueur1() {
        return joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }

    public int[][] getTableau() {
        return tableau;
    }

    public void setTableau(int[][] tableau) {
        this.tableau = tableau;
    }

    public boolean isGagnant() {
        return gagnant;
    }

    public void setGagnant(boolean gagnant) {
        this.gagnant = gagnant;
    }

    public Joueur getGagne() {
        return gagne;
    }

    public void setGagne(Joueur gagne) {
        this.gagne = gagne;
    }

    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public int getColone() {
        return colone;
    }

    public void setColone(int colone) {
        this.colone = colone;
    }

    public int getNbCoup() {
        return nbCoup;
    }

    public void setNbCoup(int nbCoup) {
        this.nbCoup = nbCoup;
    }

    public Chronometre getChrono() {
        return chrono;
    }

    public void setChrono(Chronometre chrono) {
        this.chrono = chrono;
    }

    public Joueur getJoueurencours() {
        return joueurencours;
    }

    public void setJoueurencours(Joueur joueurencours) {
        this.joueurencours = joueurencours;
    }

    public int getDernierCoupX() {
        return dernierCoupX;
    }

    public void setDernierCoupX(int dernierCoupX) {
        this.dernierCoupX = dernierCoupX;
    }

    public int getDernierCoupY() {
        return dernierCoupY;
    }

    public void setDernierCoupY(int dernierCoupY) {
        this.dernierCoupY = dernierCoupY;
    }

    public boolean isProlongation() {
        return prolongation;
    }

    public void setProlongation(boolean prolongation) {
        this.prolongation = prolongation;
    }

    public int getNumTour() {
        return numTour;
    }

    public void setNumTour(int numTour) {
        this.numTour = numTour;
    }

    public int getAquiletours() {
        return aquiletours;
    }

    public void setAquiletours(int aquiletours) {
        this.aquiletours = aquiletours;
    }
}
