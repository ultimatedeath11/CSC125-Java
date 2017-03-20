/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.ch5.pkg23;

/**
 *
 * @author noah
 */
public class HWCh523 {

    /**
     * @param args the command line arguments
     */
    
    /**
     * Use DeMorgan's laws to write equivalent expression for the following, and
     * the new expression in each case produce the same value:
     * 1. !(x < 5) && !(y >= 7)
     * 2. !(a==b) || !(g != 5)
     * 3. !((x <=8) && (y > 4))
     * 4. !((i > 4) || (j<=6))
     * @param args 
     */
    
    public static void main(String[] args) {
        
        /**
         * Opposites:
         * 1. !((x < 5) || (y >=7))
         * 2. !((a==b) && (g!=5))
         * 3. ( !(x <= 8) || !(y>4))
         * 4. (!(i>4) && (j<=6))
         */
        
        int x = 4,
                y = 8,
                a = 9,
                b = 9,
                i = 3,
                g = 5,
                j = 7;
                
        
        if(!((x < 5) && !(y >= 7))){
            System.out.println("1 is true");
        }
        if ((!(x < 5) || (y >=7))){
            System.out.println("1 is fully true");
        }
        
        if(!(a==b) || !(g != 5)){
            System.out.println("2 is true");
        }
        if(!((a==b) && (g!=5))){
            System.out.println("2 is fully true");
        }
        
        if(!((x <=8) && (y > 4))){
            System.out.println("3 is true");
        }
        if(( !(x <= 8) || !(y>4))){
            System.out.println("3 is fully true");
        }
        
        if(!((i > 4) || (j<=6))){
            System.out.println("4 is true");
        }
        if((!(i>4) && !(j<=6))){
            System.out.println("4 is fully full");
        }
    }
    
}
