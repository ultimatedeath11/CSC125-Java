/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2_30;

import java.util.Scanner;

/**
 *
 * @author Noah
 * 
 * Write an application that inputs one number consisting of 5 digits from the
 * user, seporates the number into its individual digits and prints the digits 
 * separated from one another by 3 spaces each
 * 
 */
public class HW2_30 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//Listing all of the varibles planned to use
            int inputnum,
                tenThous,
                thousandths,
                hundreths,
                tens,    
                ones;
        
            //So were putting the number of input into a varible
            System.out.println("Please enter 5 digits.");
            System.out.print(">");
            inputnum = input.nextInt();
           
            //and the math begins
            tenThous = inputnum / 10000;
            
                inputnum = inputnum - (tenThous * 10000);
            
            thousandths = inputnum / 1000;
            
                inputnum = inputnum - (thousandths * 1000);
            
            hundreths = inputnum / 100;
            
                inputnum = inputnum - (hundreths * 100);
            
            tens = inputnum / 10;
            
                inputnum = inputnum - (tens * 10);
            
            ones = inputnum / 1;
                inputnum = inputnum - (tens * 1);
                    
            
        System.out.printf("%d%n %d%n %d%n %d%n %d%n", tenThous, thousandths,
                hundreths,tens, ones);
        
    }
    
}
