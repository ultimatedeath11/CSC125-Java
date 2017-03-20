/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.ch5.pkg33;

/**
 *
 * @author noah
 */
public class HWCh533 {

    /**
     * @param args the command line arguments
     */
    
        /**
     * Use Compounding growth to calculate how much Facebook grows, assuming it grows
     * at a constant rate of 4% a month. calculate how many months it would take
     * for the user base to be 1.5 billion and 2 billion. 
     */
    
           
    public static void main(String[] args) {
        double facebookUsers = 1000000000;
        int i = 0; 
        
        
        while (i <=0){
        if (facebookUsers < 1500000000){
            facebookUsers = facebookUsers * .04;
            System.out.println("In this month, Facebook's user total is " +
            facebookUsers);
        }else if(facebookUsers < 2000000000){
            facebookUsers = facebookUsers * .04;
            System.out.println("Facebook users are now at this record high. " +
                    facebookUsers);
            
            }
        i++;
        
        if (facebookUsers >= 1500000000 && facebookUsers < 2000000000){
            System.out.println("The Facebook community has grown to be "
                    + "1500000000 users storng, and it only took " + i+" months to do this");
        }else if (facebookUsers >= 2000000000){
            System.out.println("Facebook Hits 2 Billion Users!!!");
        }
        
        }
    }
    
}
