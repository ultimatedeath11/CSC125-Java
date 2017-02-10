/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2.pkg17;

/**
 *
 * @author Noah Franck Homework 2.17
 *
 * App that inputs 3 ints from user and displays: sum, average, product,
 * smallest and largest numbers.
 *
 * Adverage should be an integer
 *
 */
import java.util.Scanner;

public class HW217 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,//defining the numbers
                num2,
                num3,
                prodnum123,
                numavg,
                numsum;

        System.out.println("For this program you will need to tell me 3 numbers");
        System.out.println("Please list the first number");
        System.out.print(">");
        num1 = input.nextInt();

        System.out.println("Thank you. Now can you give me the second number?");
        System.out.print(">");
        num2 = input.nextInt();

        System.out.println("Thank you. Now can you give me the last number?");
        System.out.print(">");
        num3 = input.nextInt();

        System.out.println("Thank you now to let you know about your numbers:");
        numsum = num1 + num2 + num3;
        prodnum123 = num1 * num2 * num3;
        numavg = (num1 + num2 + num3) / 3;

        System.out.printf("They add up to %d$n, and "
                + "when multiplied together, they are %d%n, and"
                + "there average is %d%n", numsum, prodnum123, numavg);

        //largest number if statment
        if ((num1 > num2) && (num2 > num3)) {
            System.out.printf("The largest number is %n%d", num1);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.printf("The largest number is %n%d", num2);
        } else if 
        
        
    
    }

}
