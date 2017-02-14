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
    private String name; //instance barible
    private double balance;

    //constructor name initilizeds name with paramert name... ID
    public Account(String name) //constructio name is class name
    {
        this.name = name;

        //validate that the balance is greater than 0.0; if it's noe,
        //instance variable balance keeps its default initial vale of 0.0
        if(balance > 0.0)
            this.balance = balance;
    }

    //creating deposit
    public void deposit(double depositAmount)
    {
         if(depositAmount > 0.0) //makeing sure it is valad
          balance = balance + depositAmount;
    }

//method that returns the account balance
     public double getBalance()
     {
          return balance;
     }


    //method to set the name in the object
    public void setName(String name)
    {
        this.name = name; //store the name

    }

    //method to retrieve the name from the object
    public String getName()
    {
        return name; //return value of name to caller

    }

}
