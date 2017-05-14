/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figure.pkg11.pkg2;

import java.util.Scanner;

/**
 *
 * @author NoahFranck
 */
public class DividingByZero {

    //demonstrates throwing an exception when a divided-by-zero occurs
    public static int quotient(int numerator, int denominator){
        return numerator / denominator; //possible here to divide by 0
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        //below's block of code is the user's input
        System.out.println("Please enter an integer numerator: ");
        int numerator = in.nextInt();
        System.out.println("Please enter an integer denominator: ");
        int denominator = in.nextInt();
        
        //below's code is outputting the answer and assigning the answer by method.
        int result = quotient(numerator, denominator);
        System.out.printf("%nResult: %d / %d = %d%n",numerator, denominator, result);
        
    }
    
}
