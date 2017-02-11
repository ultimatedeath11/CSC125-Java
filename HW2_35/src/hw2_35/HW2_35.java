/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2_35;

import java.util.Scanner;

/**
 *
 * @author Noah
 * 
 * This Application is going to be different, it involves lots of research
 * instead im going to use rough estamates.
 * 
 */
public class HW2_35 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    //defining the new variables
    
    int Tmiles,
            numOfPeopleinCar,
            mperg;
    
    double CostGas,
            parkFee,
            savings,
            tollsPerDay;
    
    //prompting and storing total miles deiven each day
    
    System.out.println("How many total people can fit in one car?");
    System.out.print(">");
    numOfPeopleinCar = input.nextInt();
    
    
    System.out.println("What is your total miles driven each day?");
    System.out.print(">");
    Tmiles = input.nextInt();
    
    System.out.println("What is the cost of Gas in your city?");
    System.out.print(">");
    CostGas = input.nextInt();
    
    System.out.println("How many miles per gallon does your car get?");
    System.out.print(">");
    mperg = input.nextInt();
    
    System.out.println("What is your daily parking fee?");
    System.out.print(">");
    parkFee = input.nextInt(); 
    
    System.out.println("How many tolls do you pass each day?");
    System.out.print(">");
    tollsPerDay = input.nextInt();
    
    savings = (Tmiles * (mperg / CostGas) * numOfPeopleinCar + (tollsPerDay * numOfPeopleinCar * parkFee));
    
        System.out.printf("The total savings that can be saved is %d", savings);
    }
    
}
