/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JFrame;

/**
 *
 * @author NoahFranck
 */
public class DrawPanelTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create a panel that contains the drawing
        DrawPanel panel = new DrawPanel();
        
        //crate a new frome to hold the panel
        JFrame application = new JFrame();
        
        //set the frame to exit when it is closed 
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel); //add the panel to the frame
        application.setSize(250,250);// set the size of the visible frame
        application.setVisible(true);//make the frame visible

        
    }
    
}
