/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4.pkg9;
import java.util.Scanner;
/**
 *
 * @author noah.franck
 */
public class Ch49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0; //initilize the sum of grades entered by the user
        int gradeCounter = 1; // grade to be entered next
        int grade;
        int average;
        String errormsg;//user's input to override or not
        
        while(gradeCounter <=  10 )//should loop 10 times
        {
            System.out.print("Enter grade:");
            grade = input.nextInt();//setting the user's input as the grade
            
            if(grade > 100){
                System.out.println("ERROR! The grade can not be above 100");
                System.out.println("default grade to 100? 'y' for yes or 'o' for"
                        + " override");
                errormsg = input.nextLine();
                if(errormsg == "y"){
                    grade = 100;
                }
                
                
            }
            
            total = total + grade;//increasing the total
            gradeCounter = gradeCounter + 1; //increasing the incrament counter
        }
        
         average = total / 10;// setting the average through division
        
        //printing out in the console. 
        System.out.println("Total of all 10 grades are" + total);
        System.out.println("The class average is " + average );
        
            
    }
    
}
