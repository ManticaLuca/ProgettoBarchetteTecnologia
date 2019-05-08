/*
 * La classe gestisce l'acqua
 */
package barcaNellaVasca;

/**
 *
 * @author Mantica Luca
 */
public class Acqua {

    float altezza;
    //questo si vede dopo come fare....
    String colore;

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

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    void disegna() {
    }
}
