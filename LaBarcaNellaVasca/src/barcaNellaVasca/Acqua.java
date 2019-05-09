/*
 * La classe gestisce l'acqua
 */
package barcaNellaVasca;

import java.awt.Color;

/**
 *
 * @author Mantica Luca
 */
public class Acqua {

    private float altezza;
    private Color colore;

    public Acqua() {
    }

    public Acqua(float altezza) {
        this.altezza = altezza;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public Color getColore() {
        return colore;
    }

    public void setColore(Color colore) {
        this.colore = colore;
    }

    public void disegna() {
    }

    public void aumentaAltezza(float ofAltezza) {
        altezza += ofAltezza;
    }

    public void diminuisciAltezza(float ofAltezza) {
        if (altezza - ofAltezza > 0) {
            altezza -= ofAltezza;
        }
    }
}
