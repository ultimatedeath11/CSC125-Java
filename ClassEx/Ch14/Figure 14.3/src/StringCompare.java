/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NoahFranck
 */
public class StringCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = new String("hello");//copy of s1
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";
        
        System.out.printf(
        "s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n%n", s1, s2, s3, s4);
        
        //testing for equality
        if(s1.equals("hello"))
            System.out.println("S1 equals \"hello\"");
        else
            System.out.println("s1 does not equal \"hello\"");
    }
    
}
