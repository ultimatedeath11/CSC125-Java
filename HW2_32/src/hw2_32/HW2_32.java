/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2_32;
import java.util.Scanner;

/**
 *
 * @author Noah
 */
public class HW2_32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please print out 5 digits. "
                + "(They can be positive or negative)");
        //identifying the varibles
        int num1,
                num2,
                num3,
                num4,
                num5,
                posnum = 0,
                negnum = 0,
                zero = 0;
        
        //defining varibles
        
        System.out.print(">");
            num1 = input.nextInt();
        
        System.out.print(">");
            num2 = input.nextInt();
        
        System.out.print(">");
            num3 = input.nextInt();
        
        System.out.print(">");
            num4 = input.nextInt();
        
        System.out.print(">");
            num5 = input.nextInt();
        
        if(num1 > 0)
        {
            posnum = posnum + 1;
        }
            else if (num1 < 0)
            {
                negnum = negnum + 1;
            }
            
            else if (num1 == 0)
            {
                zero = zero + 1;
            }
             
    }
    
}
