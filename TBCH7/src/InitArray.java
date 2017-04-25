/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NoahFranck
 */
public class InitArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array = {
            32,
            27,
            64,
            18,
            95,
            14,
            90,
            70,
            60,
            37
        };
                
        System.out.printf("%s%8s%n", "Index", "value");//column headings
        
        //output each array elemnt's value
        for(int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
        
    }
    
}
