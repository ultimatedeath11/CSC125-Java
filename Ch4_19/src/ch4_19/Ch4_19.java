/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_19;
import java.util.Scanner;
/**
 *
 * @author noah.franck
 */
public class Ch4_19
{

    /**
     * @param args the command line arguments
     */
    
    /**
     * large company pays its salespeopel on a commission basis.
     * the sales people recieve $200 a week plus 9% of their 
     * gross sales for that week!
     * 
     * item values are as followed:
     * 
     *239.99
     *129.75
     * 99.95
     * 350.89
     * 
     * Develop an app that will input what someone sales for last week and 
     * calculates what he earned 
     * 
     * note that there is no limit to amount that can be sold. 
     * 
     * @param args 
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i =1;i>=0;i++){
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter the quantity of item 1 sold %n>");
        int numOf1 = input.nextInt();
        
        System.out.printf("How many did the same seller sell of item 2?%n>");
        int numOf2 = input.nextInt();
        
        System.out.printf("Please enter the quantity of item 3 that was sold?%n>");
        int numOf3 = input.nextInt();
        
        System.out.printf("Please enter the quantity of item 4 that was sold?%n>");
        int numOf4 = input.nextInt();
        
        System.out.printf("Please enter the quantity of item 5 that was sold?%n>");
        int numOf5 = input.nextInt();
        
        double total = numOf1 * 2399.99;
        total = (numOf2 * 129.75) + total;
        total = (numOf3 * 99.95) + total;
        total = (numOf4 * 350.89) + total;
        
        System.out.print("this is the amount that employee number " +i+
                "recieved from commission $");
        System.out.println(total);
        System.out.print("And this is how much money he will get over all $");
        System.out.print(total+200);
        }
        
        
    }
    
}
