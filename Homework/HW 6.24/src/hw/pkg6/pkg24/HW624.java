/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg6.pkg24;

/**
 *
 * @author NoahFranck
 */

//Write a method called isPerfect to compare if all numbers are perfect between 
//1-1000


public class HW624 {

    /**
     * @param args the command line arguments
     */
    
    public HW624(){
    
}
    
    public int isPerfect(int toTest){
        
        
        int i = toTest;
        int ii= 0;
        int sum = 0;
        while(i > 0){
            if(toTest % i == 0){
                sum = sum + i;
            }
            
            i = i-1;
        }
        sum = sum - toTest;
        if(toTest == sum){
            System.out.println(toTest);
            
            
            
            return toTest;
        }else{
            
            return toTest;
        }
        
    }
    
    public static void main(String[] args) {
        int testAll = 1;
        double death = 1000000000 * 9;
        HW624 perfectTest = new HW624();
        
        
        for(;testAll < death; testAll++){
        perfectTest.isPerfect(testAll);
            if(testAll % 100000 == 0){
                System.out.println("another Million Down!!!");
        }
        }
        
        System.out.println("Finished");
        
    }
    
}
