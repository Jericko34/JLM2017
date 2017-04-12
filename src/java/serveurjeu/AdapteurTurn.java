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
public class AdapteurTurn {

    private static AdapteurTurn INSTANCE = null;

    private AdapteurTurn() {
    }
    
    public static AdapteurTurn getInstance() {
        if (INSTANCE == null){INSTANCE = new AdapteurTurn();}
        return INSTANCE;
    }
}
