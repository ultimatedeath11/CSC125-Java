
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Goal is to write an application that will execute a math formula. 
 * Finding the Determinant for at minimum 2x2 matrix, with bonus of taking a 
 * matrix at any size. The matrix's dimensions are to be passed from the 
 * user. 
 * In addition the program should be able to handle multiplying 2 Matrixes 
 * together and an integer by the matrix. 
 * 
 * @author NoahFranck & Camron Johnson
 */
public class MainClass {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //below will be variables creation
        int row = 0;
        int SizeOfMatrix = 0; //variable for the dimensions of the matrix
<<<<<<< HEAD
        int Matrix[][];
=======
        int height = 0;
        int Solution[]; //array for solutions to be printed. 
        //maybe redundant based on wheather I use methods or not. 
>>>>>>> origin/Personal_computer
        
        //below will ask the user and then will pass their answer into the var
        System.out.println("Please enter the dimensions of the Matrix");
        SizeOfMatrix = input.nextInt();
        
<<<<<<< HEAD
        Matrix[][]
=======
        int matrix1[][] = new int[SizeOfMatrix][SizeOfMatrix];//creating the first two dimensional array
        int matrix2[][] = new int [SizeOfMatrix][SizeOfMatrix];//creating the second 2 dimenisonal array
        
        
        //below double loop will fill ANY size matrix based on the dimensions. 
        for(;height < SizeOfMatrix; height ++){
        for (; row <  matrix1.length; row++) {
            System.out.print("Enter what you would like at position ("+ row+","+height +")");
            matrix1[row][height] = input.nextInt();  
        } row = 0;
        }
        
        
        
        
>>>>>>> origin/Personal_computer
        
    }
    
}
