/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcaNellaVasca;

import processing.core.PApplet;

/**
 *
 * @author Davide Mauri
 */
public class Main extends PApplet {

    static DatiCondivisi d;
    static Barchetta barca;
    static thBarchetta thB;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        d = new DatiCondivisi(2, 2);
        barca = new Barchetta(d);
        thB = new thBarchetta(barca);
        PApplet.main(new String[]{"barcaNellaVasca.Main"});

        FinestraComandi finestraComandi = new FinestraComandi(d);
        finestraComandi.show();
    }

    public void settings() {
        size(800, 400);
        thB.start();
    }

    public void setup() {
        frameRate(30);
    }

    public void draw() {
        disegnaScatole(d.getVasche());
        disegnaBarca(barca);
    }

    public void disegnaBarca(Barchetta barca) {
        quad(barca.getPuntiX()[0], barca.getPuntiY()[0],
                barca.getPuntiX()[1], barca.getPuntiY()[1],
                barca.getPuntiX()[2], barca.getPuntiY()[2],
                barca.getPuntiX()[3], barca.getPuntiY()[3]);
    }

    public void disegnaScatole(Vasca[][] vasche) {
        for (int i = 0; i < d.getRigheVasche(); i++) {
            for (int j = 0; j < d.getColonneVasche(); j++) {
                quad(vasche[i][j].getPuntiX()[0], vasche[i][j].getPuntiY()[0],
                        vasche[i][j].getPuntiX()[1], vasche[i][j].getPuntiY()[1],
                        vasche[i][j].getPuntiX()[2], vasche[i][j].getPuntiY()[2],
                        vasche[i][j].getPuntiX()[3], vasche[i][j].getPuntiY()[3]);
            }
        }
    }
}
