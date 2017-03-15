/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_18;

import java.util.Scanner;
public class Ch4_18
{

    /**
     * @param args the command line arguments
     */
    
    /**
     * Assignment is credit limit calculator, develop a java app 
     * that determines wheather any of severy department sore customers 
     * have exceeded the credit limit on a charge account. 
     * for each customer the following are available:
     * 
     * account number
     * balance at begining of month
     * total of all items charged by customer this month
     * total of all credits applied ot the customer's account this month
     * allowed credit limit
                    
    
    **/
    public static void main(String[] args) {
        
        
         Scanner input = new Scanner(System.in);
        
        double beginbal; 
        int accnum,
                totalAllItems,
                totalAllPayment,
                newBalance,
                creditLimit;
        
        System.out.println("What is the person's account number?");
        accnum = input.nextInt();
        
        System.out.println("What is the account's balance?");
        beginbal = input.nextDouble();
        
        System.out.println("What charges has he tried to make?");
        totalAllItems = input.nextInt();
        //I chose inputs to be an integer because with my card, they will round
        //off the change for my avalible credit, but they will stil make me pay
        
        System.out.println("What is the total credit limit allowed?");
        creditLimit = input.nextInt();
        
        System.out.println("What is the total of all payments and returns made?");
        totalAllPayment = input.nextInt();
        
        
        
        
        
        
        
    }
    
}
