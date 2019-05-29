/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcaNellaVasca;

/**
 *
 * @author Davide Mauri
 */
public class DatiCondivisi {

    private Vasca[][] vasche;
    private float velocitaBarca;
    private int inclinazioneX;
    private int inclinazioneY;
    private int righeVasche;
    private int colonneVasche;

    public DatiCondivisi(int righeVasche, int colonneVasche) {
        this.righeVasche = righeVasche;
        this.colonneVasche = colonneVasche;
        vasche = new Vasca[this.righeVasche][colonneVasche];
        for (int i = 0; i < this.righeVasche; i++) {
            for (int j = 0; j < this.colonneVasche; j++) {
                vasche[i][j] = new Vasca(j, i);
            }
        }

        inclinazioneX = 0;
        inclinazioneY = 0;
        velocitaBarca = 0f;
    }

    public void incrementaInclinazioneX() {
        inclinazioneX++;
        System.out.println("X: " + inclinazioneX);
    }

    public void decrementaInclinazioneX() {
        inclinazioneX--;
        System.out.println("X:" + inclinazioneX);
    }

    public void incrementaInclinazioneY() {
        inclinazioneY++;
        System.out.println("Y: " + inclinazioneY);

    }

    public void decrementaInclinazioneY() {
        inclinazioneY--;
        System.out.println("Y: " + inclinazioneY);
    }

    public int getInclinazioneX() {
        return inclinazioneX;
    }

    public int getInclinazioneY() {
        return inclinazioneY;
    }

    public int getRigheVasche() {
        return righeVasche;
    }

    public int getColonneVasche() {
        return colonneVasche;
    }

    public float getMaxSxScreen() {
        return vasche[0][0].getPuntiX()[0];
    }

    public float getMaxDxScreen() {
        return vasche[0][colonneVasche - 1].getPuntiX()[2];
    }

    public float getTopScreen() {
        return vasche[0][0].getPuntiY()[0];
    }

    public float getBottomScreen() {
        return vasche[righeVasche - 1][0].getPuntiY()[3];
    }

    public Vasca[][] getVasche() {
        return vasche;
    }
}
