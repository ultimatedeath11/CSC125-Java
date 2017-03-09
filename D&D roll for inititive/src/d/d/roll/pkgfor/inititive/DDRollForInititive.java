/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.d.roll.pkgfor.inititive;

/**
 *
 * @author noah
 */
import java.util.Scanner;
import java.util.Arrays;
public class DDRollForInititive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //name the variables
        int quantity;
        int i = 1;
        //checking how many things are used
        System.out.println("Please list all of the creatures in combat.");
        System.out.print(">");
        quantity = input.nextInt();
                
        int arr[] = new int[quantity + 1];
        String names[] = new String[quantity + 1];
        while (i <= quantity){
            System.out.println("Please enter the name of the entity.");
            names[i] = input.next();
            
            
            
            System.out.println("Please enter the inititive of the character");
            arr[i] = input.nextInt();
            
            
            i++;
        }
        
        System.out.println(Arrays.toString(names)+ " ");
        System.out.println(Arrays.toString(arr));
        
        
        
    }
    
}
