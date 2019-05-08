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
    private Barca barca;
    private int inclinazioneX;
    private int inclinazioneY;
    
    public DatiCondivisi(Barca b1){
        barca = b1;
        inclinazioneX = 0;
        inclinazioneY = 0;
    }
    
    public void incrementaInclinazioneX(){
        inclinazioneX++;
        barca.spostamentoX(inclinazioneX);
    }
    
    public void decrementaInclinazioneX(){
        inclinazioneX--;
        barca.spostamentoX(inclinazioneX);        
    }
    
    public void incrementaInclinazioneY(){
        inclinazioneY++;
        barca.spostamentoY(inclinazioneY);
        
    }
    
    public void decrementaInclinazioneY(){
        inclinazioneY--;
        barca.spostamentoY(inclinazioneY);
    }
}