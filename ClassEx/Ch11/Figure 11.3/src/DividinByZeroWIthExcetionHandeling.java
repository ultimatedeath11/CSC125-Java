
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NoahFranck
 */
public class DividinByZeroWIthExcetionHandeling {
//demonstrates throwing an exception when '/ by 0' occurs. 
    public static int quotient(int n, int d)
            throws ArithmeticException {
        return n/d;
    }//possible division by zero
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        boolean continueLoop = true; //determins if more input is needed
        do{
            try{ //read 2 numbers and calculate quoient
                System.out.print("Enter a Numerator: ");
                int numer = Scanner.nextInt();
                System.out.print("please enter a Denominator: ");
                int denom = Scanner.nextInt();
                
                int result = quotient(numer, denom);
                System.out.printf("%nResult: %d / %d = %d%n",numer, denom,
                        result);
                continueLoop = false; //input Sucessful; end looping process. 
            }
            
            catch (InputMismatchException inputMismatchException){
                System.err.printf("%nException: %s%n", inputMismatchException);
                Scanner.nextLine();//discard input so user can input another
                System.out.printf("You must enter integers. Please try again. "
                        + "%n%n");   
            }
            
            catch(ArithmeticException arithmeticException){
                System.err.printf("%nException:%s%n", arithmeticException);
                System.out.printf("Zero is an invalid Denominator. Please try"
                        + "again %n%n");
            }
        }while(continueLoop);
        
    }
    
}
