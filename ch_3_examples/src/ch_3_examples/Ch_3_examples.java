/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch_3_examples;

/**
 *
 * @author noah
 */
import java.util.Scanner;
public class Ch_3_examples {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Account myAccount = new Account();
        
        System.out.printf("Initial name is: %s%n%n",myAccount.getName());
        System.out.println("Please inter the name :");
        String theName = input.nextLine();
        myAccount.setName(theName); //temporary varible that was created on the fly
        
        System.out.println();
        
        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getname());
        
    }
    
}
