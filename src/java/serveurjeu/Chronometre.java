/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveurjeu;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Benjamin
 */
public class Chronometre {

    private static Chronometre INSTANCE = null;
    private int debut;
    private int fin;
    private int resultat;
    private SimpleDateFormat secdeb;
    private SimpleDateFormat secfin;
    private SimpleDateFormat mindeb;
    private SimpleDateFormat minfin;
    private Date aujourdhui;

    private Chronometre() {
        mindeb = new SimpleDateFormat("mm");
        minfin = new SimpleDateFormat("mm");
        secdeb = new SimpleDateFormat("ss");
        secfin = new SimpleDateFormat("ss");
    }

    public void start() {
        debut = Integer.parseInt(mindeb.format(new Date())) * 60 + Integer.parseInt(secdeb.format(new Date()));
    }

    public int stop() {
        debut = Integer.parseInt(minfin.format(new Date())) * 60 + Integer.parseInt(secfin.format(new Date()));
        resultat = fin - debut;
        return resultat;
    }

    public void reset() {
        debut = 0;
        fin = 0;
        resultat = 0;
    }

    public static Chronometre getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Chronometre();
        }
        return INSTANCE;
    }

}
