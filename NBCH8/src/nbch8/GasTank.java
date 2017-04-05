/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbch8;

/**
 *
 * Write a class  named  GasTank containing:
An instance variable  named  amount of type  double , initialized  to 0.
A method  named  addGas that accepts a parameter  of type  double . 
*   The value  of the amount instance variable  is increased  by the value  of the parameter .
A method  named  useGas that accepts a parameter  of type  double . 
*   The value  of the amount instance variable  is decreased  by the value  of the parameter .
A method  named  getGasLevel that accepts no parameters .
*   getGasLevel returns the value  of the amount instance variable .
 * 
 * @author NoahFranck
 */
public class GasTank {
    private double amount;
    
    
    public void addGas(double a){
        amount = amount + a;
    }
    
    public void useGas(double a){
        amount = amount - a;
    }
    
    public double getGasLevel(){
        return amount;
    }
    
}
