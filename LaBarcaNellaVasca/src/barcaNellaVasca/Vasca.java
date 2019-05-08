/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcaNellaVasca;

import javafx.scene.shape.Box;
import processing.core.PApplet;

import java.awt.*;

/**
 *
 * @author Rairokul
 */
public class Vasca {

    private final PApplet processingSketch;
    private Acqua acqua;
    private Barca barca;

    private Box dimensione;
    private Point posizione;

    private float inclinazioneX;
    private float inclinazioneY;

    private DatiCondivisi d;

    public Vasca(PApplet processingSketch) {
        this.processingSketch = processingSketch;
        dimensione = new Box();
        dimensione.setDepth(100);
        dimensione.setHeight(500);

        posizione = new Point(200, 200);

        acqua = new Acqua();

        barca = new Barca(this.processingSketch, this.posizione);
        barca.mostraBarca();
    }

    public Vasca(PApplet processingSketch, Point posizione) {
        this.processingSketch = processingSketch;
        dimensione = new Box();
        dimensione.setWidth(100);
        dimensione.setDepth(100);
        dimensione.setHeight(50);
        this.posizione = posizione;
        acqua = new Acqua(10); //quantità di acqua
        barca = new Barca(this.processingSketch, this.posizione);
        barca.mostraBarca();
        inclinazioneX = 0;
        inclinazioneY = 0;
    }

    public Vasca(PApplet processingSketch, Box dimensione, Point posizione, Acqua acqua, Barca barca) {
        this.processingSketch = processingSketch;
        this.dimensione = dimensione;
        this.posizione = posizione;
        this.acqua = acqua;
        this.barca = barca;
        inclinazioneX = 0;
        inclinazioneY = 0;
        barca = new Barca(this.processingSketch, this.posizione);
        barca.mostraBarca();
    }

    public void spostaAcqua(float altezza, Vasca altra) {
        Acqua.diminuisciQuantità(altezza);
        altra.acqua.aumentaQuantità(altezza);
    }

    void aggiornaPosBarca(Barca barca, float newX, float newY) {

    }

    void draw() {

    }
}
