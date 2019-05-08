/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nb_processingBarchetta;

/**
 *
 * @author Davide Mauri
 */
public class Barca {
    private float[] puntiX;
    private float[] puntiY;
    
    
    public Barca(float[] puntiX, float[] puntiY){
       this.puntiX = puntiX;
       this.puntiY = puntiY;
    }
    
    
    public void spostamentoX(float inclinazione){
        for(int i=0; i < puntiX.length; i++)
            puntiX[i] += inclinazione/10.0f;
    }
    
    public void spostamentoY(float inclinazione){
        for(int i=0; i < puntiY.length; i++)
            puntiY[i] += inclinazione/10.0f;
    }
    
    
}
