/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author NoahFranck
 */
public class DrawPanel extends JPanel {
    
    //draws an x form the corners of the panel
    public void paintComponent(Graphics g){
        //call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);
        
        int width = getWidth(); //total width
        int height = getHeight(); // total height
        
        //draw a line form the upper-left to the lower-right
        g.drawLine(0,0,width,height);
        
        //draw a line from the lower-left to the upper-right
        g.drawLine(0, height, width, 0);
        
    }
    
}
