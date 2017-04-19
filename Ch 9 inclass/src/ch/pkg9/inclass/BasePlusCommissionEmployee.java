/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.pkg9.inclass;

/**
 * //figure 9.8 from textbook trying to work with extending and inheritence
 * @author NoahFranck
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary; // base salary per week
    
    //six - argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String 
            socialSecurityNumber, double grossSales, double CommissionRate,
            double baseSalary){
        
        //explicitely calling to super class Ch9Inclass constructor
        //required to be stated and denoted by the 'super' 
        super(firstName, lastName, socialSecurityNumber, grossSales, 
                CommissionRate);
        
        //if baseSalary is invalid throw exception
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        this.baseSalary = baseSalary;
    
    }
    
    //set base salary
    public void setBaseSalary(double baseSalary){
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        this.baseSalary = baseSalary;
    }
    
    //returning base salary
    public double getBaseSalary(){
        return baseSalary;
    }
    
    //calculate earngings
    @Override
    public double earnings(){
        return baseSalary + (CommissionRate * grossSales);
        
    }
    
    //return Stirng representation of BasePlusCommissionEmploye
    @Override
    public String toString(){
        return String.format(
            "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %f",
            "base-salaried commission employee",
            firstName, lastName, "Social Security Number", "Gross sales",
            grossSales, "Commission rate", CommissionRate,
            "Base salary", baseSalary
                
            
        );
    }
    
    
}
