/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author noah.franck
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input = 58765,
                one,
                tens,
                thousandths,
                tethousanths;
        
        System.out.println(input);
        System.out.println(input / 10000);
        input = input % 10000;
        System.out.println(input);
        input = input / 1000;
        System.out.println(input);
        System.out.println(input / 100);
        input = input % 10000;
        System.out.println(input);
        input = input / 10;
        System.out.println(input);
        
    
}
