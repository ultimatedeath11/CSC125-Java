/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NoahFranck
 */
public class StringStartEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] strings = {
            "started", 
            "starting", 
            "ended", 
            "ending",
        };
        
        //test method startsWith
        for(String string : strings){
            if(string.startsWith("st"))
                System.out.printf("\"%s\" starts with \"st\"%n", string);
        }
        
        System.out.println();
        
        //test metod startsWith starting form positon 2 of string
        for(String string : strings){
            if(string.startsWith("st"))
                System.out.printf("\"%s\" starts with \"art\" at position 2%n",
                        string);
        }
        System.out.println();
        
        //test method endsWith
        for(String string : strings){
            if(string.endsWith("ed"))
                System.out.printf("\"%s\" ends with \"ed\"%n", string);
        }
        
        
    }
    
}
