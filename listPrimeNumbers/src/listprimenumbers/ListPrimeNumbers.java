/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listprimenumbers;
import java.util.Scanner;
/**
 *
 * @author noah.franck
 */
public class ListPrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        
        for(int i = 1; i >= i; )
        {
            i = i + 1;
            System.out.println(i);
            
            if(i == 2){
                System.out.println(i);}
            else if(i % 2 == 0 || i%3 == 0 ){
                break;}
            else if ((i % 1000 == 0)||(i > 1000) )
            {
                i = i - i - 10;
                System.out.println("Continue? '1' or '0'");
                int yesno; 
                yesno = input.nextInt();
                    if(yesno == 0){
                        break;}
                    else if (yesno == 1){
                    i = 2;
                    }
                    else {break;}
            }
           
            
            
        }
        }
    }
    

