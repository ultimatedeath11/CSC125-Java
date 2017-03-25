/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg6.pkg26;

/**
 *Write a method and applicatoin that uses it, to run a take a number and return
 * it backwards to what was originally given. so if it is 7631 return 1367
 * 
 * @author NoahFranck
 */


import java.util.Scanner;
public class HW626 {

    /**
     * @param args the command line arguments
     */
    
    public static int reverse(int n){
        int reverse = 0;
        
        
      while( n != 0 )
      {
          reverse = reverse * 10;
          reverse = reverse + n%10;
          n = n/10;
      }
 
      System.out.println(reverse);
      return reverse;
    }
    
    public static void main(String[] args) {
        int num;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a number to be reversed:");
        num = input.nextInt();
        reverse(num);
    }
    
}
