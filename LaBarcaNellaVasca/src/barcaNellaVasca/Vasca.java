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
    private int barca;
    
    private Box dimensione;
    private Point posizione;
    
    private DatiCondivisi d;

    public Vasca(PApplet processingSketch) {
        this.processingSketch = processingSketch;
    }
    
    
    void aggiornaDistribuzione(float x, float y){
        
    }
    void aggiornaPosBarca(Barca barca, float newX, float newY){
        
    }
    
    void draw(){
        
    }
}
