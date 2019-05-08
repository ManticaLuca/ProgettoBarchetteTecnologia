/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcaNellaVasca;

import java.awt.Color;
import java.awt.Point;
import processing.core.PApplet;

/**
 *
 * @author Rairokul
 */
public class Barca {

    private PApplet processingSketch;

    private Point posizione;
    private float dimensioni;
    
    private Point posScatola; //angolo sx scatola
    private boolean presente;

    private Color colore;

    public Barca(Point posizione, boolean presente, float dimensioni, Color colore) {
        this.colore = colore;
        this.dimensioni = dimensioni;
        this.posizione = posizione;
        this.presente = presente;
    }

    public Barca(PApplet processingSketch, Point posScatola) {

        this.processingSketch = processingSketch;
        this.posScatola = posScatola;
        reset();
    }
    public void reset() {
        presente = false; 
        dimensioni = 10.0f;
        posizione = new Point();
        colore = new Color(0,0, 240);
        
    }
    public void draw() {
        if (presente) {
            processingSketch.fill(colore.getRGB());
            processingSketch.ellipse(posizione.x + posScatola.x, posizione.y + posScatola.y, dimensioni, dimensioni);
        }
    }
    public void mostraBarca() { //Viene aggiunta la pallina
        presente = true;
    }
    public void nascondiBarca() { 
        presente = true;
    }
    
    public void spostamentoX(int x){
        posizione.x = x;
    }
    
    public void spostamentoY(int y){
        posizione.y = y;
    }
}
