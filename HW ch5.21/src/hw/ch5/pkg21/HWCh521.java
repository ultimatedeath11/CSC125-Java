/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.ch5.pkg21;

/**
 *
 * @author noah
 */

    /**
     * A right triangle can have sides whose lengths are all integers, and the 
     * three sides are special, and have a relationship, and the first two sides 
     * squaired are equal to the square of the hypotenuce.
     * 
     * Write a program that finds every possibile right triangle up until 500 
     * units a side. 
     * @param args 
     */


public class HWCh521 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        int C = 0;
        
        System.out.println("Right triangles occur at the following points:");
        while(A < 500){
            
            A = A+1;
            
            while(B < 500){
                
                B = B+1;
                
                while(C < 500){
                    
                    C = C +1;
         
                    if((A * A) + (B * B) == (C * C) ){
                        
                        System.out.print(A);
                        
                        System.out.println("Side: " +A+ " Side: "+ B + 
                                " Hyponenuce: "+ C );
                    }
                    
                
                }
                 
                
            if((A * A) + (B * B) == (C * C) ){
                        
                        System.out.print(A);
                        
                        System.out.println("Side: " +A+ " Side: "+ B + 
                                " Hyponenuce: "+ C );
                    }
            
            
                
            }
            
            if((A * A) + (B * B) == (C * C) ){
                        
                        System.out.print(A);
                        
                        System.out.println("Side: " +A+ " Side: "+ B + 
                                " Hyponenuce: "+ C );
                    }
               
            
            
            
        }
        
        
        
        
        System.out.println(A);
        System.out.println(B);
        System.out.println(B);
        
        
    }
    
}
