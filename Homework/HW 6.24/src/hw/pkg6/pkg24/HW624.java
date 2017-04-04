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
        
        
        int i = toTest; //varialbe for looping 
        int sum = 0;//varialbe for total to see if it adds up
        while(i > 0){
            if(toTest % i == 0){
                sum = sum + i;
            }
            
            i = i-1;//going through the loop
        }
        sum = sum - toTest;//if it is perfect sum should be twice toTest so i make it equal
        if(toTest == sum){
            System.out.println(toTest);
          
            
        }return toTest;
        
    }
    
    public static void main(String[] args) {
        int testAll = 1;//what was being looped
        double death = 1000000000 * 9;//what was being tested After having it run for an hour I only found 4
        HW624 perfectTest = new HW624();//call method constructor
        
        
        for(;testAll < death; testAll++){
        perfectTest.isPerfect(testAll);//invoking method
            if(testAll % 100000 == 0){
                System.out.println("another Million Down!!!");//determining that it is still running.
        }
        }
        
        System.out.println("Finished");
        
    }
    
}
