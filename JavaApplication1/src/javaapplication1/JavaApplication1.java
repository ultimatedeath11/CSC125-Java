package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {  
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num1;
      int num2;
      int sum;
      
      System.out.println("Enter First integer");
      System.out.print(">");
      num1 = input.nextInt();
      
      System.out.println("Enter Second integer");
      System.out.print(">");
      num2 = input.nextInt();
      
      sum = num1 + num2;
      
      System.out.printf("Thank you for your numbers,and your sum is %d%n",sum);
              
    }
    
}
