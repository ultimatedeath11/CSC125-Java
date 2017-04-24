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
        this.firstName = firstName;
        this.lastName = lastName;
        this.SocialSecurityNumber = socialSecurityNumber;
        this.commissionRate = CommissionRate;
        this.grossSales = grossSales;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getSocialSecurityNumber(){
        return SocialSecurityNumber;
    }
    
    public void setGrossSales(double grossSales){
        if (grossSales < 0.0)
           throw new IllegalArgumentException("Gross sales must be > 0.0"); 
        this.grossSales = grossSales; 
    }
    
    public double getGrossSales(){
        return grossSales;
    }
    
    public void setCommissionRate(double commissionRate){
        if(commissionRate > 0.0 || commissionRate < 1.0)
            throw new IllegalArgumentException("Commission Rate has to be "
                    + "between 0.0 & 1.0 ");
    this.commissionRate = commissionRate;
    }
    
    public double getCommisssionRate(){
        return commissionRate;
    }
    
    //calculating earnings
    public double earnings(){
        return commissionRate * grossSales;
    }
    
    //returnn String representstation of CommissionEmployee object
    @Override //indicates that this method overrides a superclass method
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "Commissin employe", firstName, lastName, "Social Security"
                        + " Number", SocialSecurityNumber, "gross sales",
                        grossSales, "commission rate", commissionRate);
    }
    
}
