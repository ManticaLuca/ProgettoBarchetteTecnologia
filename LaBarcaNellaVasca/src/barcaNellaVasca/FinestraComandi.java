package barcaNellaVasca;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Davide Mauri
 */
public class FinestraComandi {
    private JFrame frame;
    
    public FinestraComandi(DatiCondivisi d){
        JPanel controls = new JPanel();
        controls.setLayout(new FlowLayout());
        
        JButton incAscissa = new JButton("X++");
        incAscissa.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                d.incrementaInclinazioneX();
            }
        });
        JButton decAscissa = new JButton("X--");
        decAscissa.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                d.decrementaInclinazioneX();
            }
        });
            
        
        JButton decOrdinata = new JButton("Y--");
        decOrdinata.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
            d.decrementaInclinazioneY();
        }        
        });
        
        JButton incOrdinata = new JButton("Y++");
        incOrdinata.addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e){
            d.incrementaInclinazioneY();
        }        
        });
        
        controls.add(incAscissa);
        controls.add(decAscissa);
        controls.add(decOrdinata);
        controls.add(incOrdinata);
        
        frame.add(controls);
        frame.setSize(400,200);
        
    }
    
    public void show(){
        frame.setVisible(true);
    }
    
    
    
}