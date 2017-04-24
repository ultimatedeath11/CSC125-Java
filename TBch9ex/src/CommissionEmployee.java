/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NoahFranck
 */
public class CommissionEmployee extends Object {
    private final String firstName;
    private final String lastName;
    private final String SocialSecurityNumber;
    private double grossSales;
    private double commissionRate;
    
    //fige-argument constructor
    public CommissionEmployee(String firstName, String LastName, 
            String socialSecurityNumber, double grossSales, 
            double CommissionRate){
        //implicit call to object's default constructor occurs here. 
        
        //if grossSales is invalid throw exception
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross Sales Must be >= 0.0");
        
        //if CommissionRate is invalid throw the expression
        if(commissionRate < 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be >= 0.0"
            +"and < 1.0");
        
        
        //setting everyhing = to everything else
        this.firstName = firstname;
        this.lastName = lastname;
        this.SocialSecurityNumber = socialSecurityNumber;
        this.commissionRate = CommissionRate;
        this.grossSales = grossSales;
    }
    
}
