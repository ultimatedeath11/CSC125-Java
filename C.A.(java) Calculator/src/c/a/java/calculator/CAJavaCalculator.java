/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.a.java.calculator;

/**
 *
 * @author noah.franck
 */
public class CAJavaCalculator
{
  public class Calculator{
public class Calculator{
  Calculator calculator = new Calculator ();
  //the above is the constructor (I believe)
  
  //objectName.methodName(parameters);

    public int add(int addnum1, int addnum2){
    return addnum1 + addnum2;
  }
  
  public int subtract(int sub1, int sub2){
	return sub1 - sub2;
  }
  
  public int multiply(int mul1, int mul2){
    return mul1 * mul2;
  }
  
  public int divide(int div1,int div2){
    if (div2 == 0){
      System.out.println("You can't devide by 0");
      return 0;
    }else{
    return div1/div2;}
    
  }
  
  public int modulo( int mod1,int  mod2){
    if (mod2 != 0 ){
      return mod1 % mod2;
    } else {
      System.out.print("Error! dividing by 0 is not allowed");
      return 0;}
    
    
  }

    /**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
     System.out.print("Hi");

}
}
    
