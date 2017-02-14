/*
 * This is from my textbook working on practice problems
 * these came stright form the book tho help me with learning the code
 * 
 */

/**
 *
 * @author noah
 */
public class Account { //the class declaration
    //private here states that only 'me' can see it
    //the me in this is the class and only the class
    private String name; //instance barible 
    private double balance;
    
    //method to set the name in the object
    public void setName(String name, double balance)
    {
        this.name = name; //store the name
        
    }
    
    //method to retrieve the name from the object
    public String getName()
    {
        return name; //return value of name to caller 
      
    }
    
    
    
    public void deposite(double depositeAmount)
    {
        if (depositeAmount > 0.0)
            balance = balance + depositeAmount;
    }
    
    public double getBalance()
    {
        return balance;
    }
}
