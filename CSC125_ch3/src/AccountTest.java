/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author noah
 */

import java.util.Scanner;

public class AccountTest {
    
    public static void main(String args[])
    {
     //create a scenner object to obtain input form the command window
        Scanner input = new Scanner(System.in);
        
        //create an Account object and assign it to myAccount
        
        Account myAccount = new Account(); //this will take the program stright
        // to the 11th line of Account.java file
        //display initial value of name (Null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
        
        //prompt for and read name
        System.out.println("Please enter the name:");
        String theName = input.nextLine(); //reading a line of text
        myAccount.setName(theName); //put theName in myAccount
        System.out.println();//outputs blank line
        
        //displays the name stored in the object myAccount
        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
        
    }
    
}
