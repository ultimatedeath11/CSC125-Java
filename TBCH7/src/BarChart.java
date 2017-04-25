/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NoahFranck
 */
public class BarChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            2,
            4,
            2,
            1,
        };
        
        System.out.println("grade Distribution:");
        
        //for each array element, output a bar of the chart
        for(int counter = 0; counter < array.length; counter++){
            //output bar label ("00-99", "100:")
            if(counter == 10)
                System.out.printf("%5d:", 100);
            else
                System.out.printf("%-2d-%02d:", counter * 10, counter * 10 + 9);
            
            //print bar of asstricts
            for(int starts = 0; starts < array[counter]; starts++)
                System.out.print("*");
            
            System.out.println();
                
        }
        
        
    }
    
}
