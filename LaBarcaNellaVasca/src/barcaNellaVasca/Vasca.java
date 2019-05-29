/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcaNellaVasca;

/**
 *
 * @author Mauri Davide
 */
public class Vasca {

    private float[] puntiX;
    private float[] puntiY;
    private Acqua acqua;
    private boolean hasTheBall;

    public Vasca(int numeroScatola, int numeroRiga) {
        puntiX = new float[4];
        inizX(numeroScatola);
        puntiY = new float[4];
        inizY(numeroRiga);
        if (numeroScatola == 0 && numeroRiga == 0) {
            acqua = new Acqua();
            hasTheBall = true;
        }

    }

    public void inizX(int numeroScatola) {
        puntiX[0] = 10 + (90 * (float) numeroScatola);
        puntiX[1] = 10 + 90 + (90 * (float) numeroScatola);
        puntiX[2] = 10 + 90 + (90 * (float) numeroScatola);
        puntiX[3] = 10 + (90 * (float) numeroScatola);
    }

    public void inizY(int numeroRiga) {
        puntiY[0] = 10 + (90 * numeroRiga);
        puntiY[1] = 10 + (90 * numeroRiga);
        puntiY[2] = 10 + 90 + (90 * numeroRiga);
        puntiY[3] = 10 + 90 + (90 * numeroRiga);
    }

    public float[] getPuntiX() {
        return puntiX;
    }

    public float[] getPuntiY() {
        return puntiY;
    }

}
