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
        
            int factors = 0;
            int j = 1;

            while(j <= i)
            {
                if(i % j == 0)
                {
                    factors++;
                }
                j++;
            }
            if (factors == 2)
            {
                System.out.println(i);
            }
        
        return i;
    }
    
    
    public static void main(String[] args) {
        int test = 1;
        for(;test < 100; test++)
        isPrime(test);
    }
    
}
