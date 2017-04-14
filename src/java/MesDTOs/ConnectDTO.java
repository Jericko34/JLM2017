/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MesDTOs;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Benjamin
 */
@XmlRootElement(name="connect")
public class ConnectDTO {

    private String idJoueur;
    private int code;
    private String nomJoueur;
    private int numJoueur;

    public String getIdjoueur() {
        return idJoueur;
    }

    public void setIdjoueur(String idjoueur) {
        this.idJoueur = idjoueur;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNomjoueur() {
        return nomJoueur;
    }

    public void setNomjoueur(String nomjoueur) {
        this.nomJoueur = nomjoueur;
    }

    public int getNumjoueur() {
        return numJoueur;
    }

    public void setNumjoueur(int numjoueur) {
        this.numJoueur = numjoueur;
    }

    public ConnectDTO() {
    }
    
    public ConnectDTO(String a, int b, String c, int d) {
        this.idJoueur = a;
        this.code = b;
        this.nomJoueur = c;
        this.numJoueur = d;
    }
}
