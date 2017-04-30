/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author NoahFranck
 */
public class NameDialog {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //promt user to enter name
        String Name = JOptionPane.showInputDialog("What is your name?");
        
        //creating the message
        String Message = String.format("Welcome, %s, to Java Programming!",Name);
        
        //display the message to welcome the user
        JOptionPane.showMessageDialog(null, Message);
        
        
    }
    
}
