/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.pkg9.inclass;

/**
 *
 * @author NoahFranck
 * from textbook pg. 366
 */
public class Ch9Inclass extends Object{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;//gross weekly sales
    private double commissionRate; //commission percentage
    
    public Ch9Inclass(String firtName, String lastName, String 
            SocialSecurityNumber, double grossSales, double commissionRate){
        //implicitely call to object's default customomer occurs here
        
        // if grossSales is invalad throw an exception
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross Sales must be >= 0.0");
        
        //if commissionRate is invalid thow exception
        if(CommissionRate <= 0.0 || comissionTate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 "
                    + "and < 1.0");
        
        
    }
    
    
    public static void main(String[] args) {
        //working on extending classes
    }
    
}
