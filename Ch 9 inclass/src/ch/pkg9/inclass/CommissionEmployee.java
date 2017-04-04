/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.pkg9.inclass;

/**
 *
 * @author NoahFranck
 */
public class CommissionEmployee extends Object{
    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityNumber;
    protected double grossSales;//gross weekly sales
    protected double CommissionRate; //commission percentage
    
//    protected files can be accessed by subclasses

    public CommissionEmployee(String firstName, String lastName, String
            socialSecurityNumber, double grossSales, double CommissionRate){
        //implicitely call to object's default customomer occurs here

        // if grossSales is invalad throw an exception
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross Sales must be >= 0.0");

        //if commissionRate is invalid thow exception
        if(CommissionRate <= 0.0 || CommissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 "
                    + "and < 1.0");

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.CommissionRate = CommissionRate;
    }//end of the constructor

    //returning the first name
    public String getFirstName(){
        return firstName;
    }

    //return last name
    public String getLastName(){
        return lastName;
    }

    //return social security number
    public String getSocialSecurityNumber(){
      return socialSecurityNumber;
    }

    //set gross sales amount
    public void setGrossSales(double grossSales){
      if(grossSales < 0.0){
        throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }
      this.grossSales = grossSales;
    }

    //return gross sales
    public double getGrossSales(){
      return grossSales;
    }

    //set commission rate
    public void setCommissionRate(double CommissionRate){
      if(CommissionRate <= 0.0 || CommissionRate >= 1.0)
        throw new IllegalArgumentException("Commission rate must be > 0.0 and "
                + "< 1.0");

        this.CommissionRate = CommissionRate;
       
     }

    //return the commission rate
    public double getCommisssionRate(){
      return CommissionRate;
    }

    //calculate earnings
    public double earnings(){
      return CommissionRate * grossSales;
    }

    //return string representation of commissionemployee object
    @Override //indicates that this method overrides a superclass method
    public String toString(){
      return String.format("%s: %s %s%n%s: %s%n%s: %s%n%s: %.2f%n%s: %.2f",
      "commission emploee", firstName, lastName, "Social Security Number",
      socialSecurityNumber, "gross sales", grossSales, "commission rate",
       CommissionRate);
    }
  }//end of the commissionEmployee class.


    //end of figure 9.4 form pg 366-368.
