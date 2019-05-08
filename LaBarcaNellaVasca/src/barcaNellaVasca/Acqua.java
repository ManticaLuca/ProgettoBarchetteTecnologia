/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcaNellaVasca;

/**
 *
 * @author Rairokul
 */
public class Acqua {

    float quantità;

    public Acqua() {
    }

    public Acqua(float quantità) {
        this.quantità = quantità;
    }

    public void aumentaQuantità(float altezza) {
        quantità += altezza;
    }
    
    public void diminuisciQuantità(float altezza) {
        quantità -= altezza;
    }

}
