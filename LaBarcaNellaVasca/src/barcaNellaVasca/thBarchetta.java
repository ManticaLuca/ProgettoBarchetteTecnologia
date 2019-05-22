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
public class thBarchetta extends Thread{
    private Barchetta b;
    
    public thBarchetta(Barchetta b){
        this.b = b;
    }
    
    public void run(){
        try{
            while(true){
                b.move();
                sleep(10);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
