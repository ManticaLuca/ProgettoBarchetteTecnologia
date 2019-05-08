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

    float altezza;
    //questo si vede dopo come fare....
    Color colore;

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

    void disegna() {
    }

    void aumentaQuantità(float altezzaAltra) {
        altezza += altezzaAltra;
    }

    void diminuisciQuantità(float altezzaAltra) {
        altezza -= altezzaAltra;
    }
}
