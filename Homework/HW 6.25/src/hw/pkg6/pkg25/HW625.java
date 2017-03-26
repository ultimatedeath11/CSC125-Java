/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg6.pkg25;

/**
 *
 * @author NoahFranck
 * write a method that determins whether a number is prime
 * use method in app to determine and display all prime numbers > 10,000
 * 
 */
public class HW625 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static int isPrime(int i){
        
        //for this I use 2 variables that I use to count how many factors each number is used
        
            int factors = 0;
            int j = 1;

            while(j <= i)//making sure to not test above what was given
            {
                if(i % j == 0)
                {
                    factors++;//every tme it is true it adds one to variable factors
                }
                j++;
            }
            if (factors == 2) //checking for when the variables are equal to 2 it is prime
            {
                System.out.println(i);
            }
        
        return i;
    }
    
    
    public static void main(String[] args) {
        int test = 1;//variable for moving. 
        for(;test < 10000; test++)//testing for numbers up to 100
        isPrime(test);//invoking the static method
    }
    
}
