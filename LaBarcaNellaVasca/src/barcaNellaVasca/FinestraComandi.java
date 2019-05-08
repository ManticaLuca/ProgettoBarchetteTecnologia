/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcaNellaVasca;

import barcaNellaVasca.DatiCondivisi;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
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
            
        
        JButton decAsissa = new JButton("Y--");
        
    }
    
    
    
}