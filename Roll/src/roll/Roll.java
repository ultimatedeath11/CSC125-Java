/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roll;

/**
 *
 * @author NoahFranck
 */
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Roll {

    /**
     * @param args the command line arguments
     */
    
    public String highToLow(HashMap<String, Integer> rolled){
        HashMap<Integer, String > inOrder = new HashMap<Integer, String>();
        int change;
        int loop = rolled.size();
        for( String name : rolled.keySet()){
            
            change = rolled.get(name);
            
            System.out.println(rolled.keySet() +" "+ change);
            
            
    
            }
   
                    
            
        }
            
        
            
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many things are fighting?");
        int i = input.nextInt();
        String name;
        int dieNumber;
        
        HashMap<String, Integer> Roll = new HashMap<String, Integer>();
        
        for(;i > 0; i-- ){
            System.out.println("What is the entities name?");
            name = input.nextLine();
            System.out.println("What did they roll?");
            dieNumber = input.nextInt();
            
            Roll.put(name, dieNumber); 
        }
        
        
    }
    
}
