/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.ch5.pkg31;

import java.util.Scanner;

/**
 *
 * @author noah
 */
public class HWCh531 {

    /**
     * @param args the command line arguments
     */
    
    /**
     *  Create a 5 questoin multiple choice quiz on global warming, each 
     * question has 4 possible answers
     * 
     * write an application that gives the test, and calculates the number of 
     * correct answers (0-5). have it give feedback
     * @param args 
     */
    

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Char answer1,
                answer2,
                answer3,
                answer4;
        int totalCorrect = 0;
        
        
        
        
        System.out.println("Welcome to the Test");
        
        System.out.println("Question 1: What species of animal has recently gone"
                + "extince?");
        System.out.println("A. Monkeys");
        System.out.println("B: Bees");
        System.out.println("C. Humans");
        System.out.println("D. Birds");
        System.out.println(">");
        
        answer1 = input.nextInt();
        
        if(answer1 == 'B'){
            totalCorrect = totalCorrect + 1;
        }else if(answer1 == 'b'){
            totalCorrect = totalCorrect + 1;
        }
        
        
        
        
    }
    
}
