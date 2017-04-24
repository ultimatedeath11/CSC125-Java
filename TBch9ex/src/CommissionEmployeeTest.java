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
        CommissionEmployee employee = new commissionEmployee(
        "Sue","Jones", "222-222-2222", 10000, .06);
        
        //get commission employee data
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n,", "First name is", employee.getFirstName());
        
    }
    
}
