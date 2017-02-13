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
        
        //creat two account objects
        Account account1 = new Account("Jane Green");
        Account account2 = new Account("John Blue");
        
        
        //displays initial value of name for each account
        
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());
    }
    
}
