/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetjson;

/**
 *
 * @author Benjamin
 */
public class connect {

    private String idjoueur;
    private int code;
    private String nomjoueur;
    private int numjoueur;

    public String getIdjoueur() {
        return idjoueur;
    }

    public void setIdjoueur(String idjoueur) {
        this.idjoueur = idjoueur;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNomjoueur() {
        return nomjoueur;
    }

    public void setNomjoueur(String nomjoueur) {
        this.nomjoueur = nomjoueur;
    }

    public int getNumjoueur() {
        return numjoueur;
    }

    public void setNumjoueur(int numjoueur) {
        this.numjoueur = numjoueur;
    }

    public connect(String a, int b, String c, int d) {
        this.idjoueur=a;
        this.code=b;
        this.nomjoueur=c;
        this.numjoueur=d;
    }

}
