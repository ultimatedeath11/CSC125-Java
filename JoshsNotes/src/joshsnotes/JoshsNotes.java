/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joshsnotes;

/**
 *
 * @author noah.franck
 */
import java.util.Arrays;
public class JoshsNotes
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //for loop vs While loops
        int n = 1;
        
        //when it is true it runs teh command and does it
        while (n < 100){
            n++;
        }
        
        //  creating and initlizing to 0 a value
        // then shoing the counter and while it is running
        //can be defiend outside of it but do it inside its easier to read
        // for (counter [integer]; true or false stametn on when to leave; what 
        //happens to the integer)
        for (int i = 0; i < 100; i++){
            n++;
        }
        
        
        //rewriting for loop as while loop 
        
        int x = 0;
        while (x < 100){
            n++;
            x++;
        }
        //System.out.println(n + i + x);
        
        
        
        // arrays
        // creating a new object that is an array
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = i;
            System.out.print(arr[i]+", ");
        }
        
        
        
       
        
    }
    
}
