/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NoahFranck
 */
public class CommissionEmployeeTest {
    public static void main(String[] args){
        //instantaine commissionEmployee object
        CommissionEmployee employee = new CommissionEmployee(
        "Sue","Jones", "222-222-2222", 10000, .06);
        
        //get commission employee data
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n,", "First name is: ", employee.getFirstName());
        System.out.printf("%n%s %s%n,", "Last name is: ", employee.getLastName());
        System.out.printf("%n%s %s%n,", "Social Security number is ", employee.getSocialSecurityNumber());
        System.out.printf("%n%s %s%n,", "Gross sales are ", employee.getGrossSales());
        System.out.printf("%n%s %s%n,", "Commission Rate is: ", employee.getCommisssionRate());
        
        employee.setGrossSales(5000);
        employee.setCommissionRate(.1);
        
        System.out.printf("%n%s: %n%n%s%n", "Updated employee info from the"
                + " tostring", employee);
    }
    
}
