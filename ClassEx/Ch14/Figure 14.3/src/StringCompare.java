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
        if(s1.equals("hello"))//true
            System.out.println("S1 equals \"hello\"");
        else
            System.out.println("s1 does not equal \"hello\"");
        
        //testing for equality for ==
        if(s1 == "hello") //false they are not the same object
            System.out.println("s1 is the same object as \"hello\"");
        else 
            System.out.println("S1 is not the same object as \"Hello\"");
        
        //test for equality (Ignore case)
        if(s3.equalsIgnoreCase(s4))
            System.out.printf("s3 equals %s with case ignored%n", s3, s4);
        else 
            System.out.println("s3 does not equal s4");
        
        //test comparedto
        System.out.printf("%ns1.compareTo(s2) is %d", s1.compareTo(s2));
        
        System.out.printf("%ns2.compareTo(s1) is %d", s2.compareTo(s1));
        
        System.out.printf("%ns1.compareTo(s1) is %d", s1.compareTo(s1));
        
        System.out.printf("%ns3.compareTo(s4) is %d", s3.compareTo(s4));
        
        System.out.printf("%ns4.compareTo(s3) is %d%n%n", s4.compareTo(s3));
        
        //test regionMatches (case sensative)
        if(s3.regionMatches(0, s4, 0, 5))
            System.out.println("First 5 characters of s3 and s4 match");
        else
            System.out.println("First 5 character of s3 adn s4 do not match");
        
        //test regionMatches (ignore case)
        if(s3.regionMatches(true, 0, s4, 0, 5))
            System.out.println("First 5 characters of s3 and s4 match with case ignored");
        else
            System.out.println("First 5 characters of s3 and s4 do not match");
            
        
    }
    
}
