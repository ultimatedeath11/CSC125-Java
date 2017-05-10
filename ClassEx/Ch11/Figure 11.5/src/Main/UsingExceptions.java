/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * Using try...catch...finally exceptions 
 * 
 * @author NoahFranck
 */
public class UsingExceptions {
    public static void main(String[] args){
        
        try{
            throwException();
        } catch(Exception exception) //exception thrown by throwException
        {
            System.err.println("Exception in handled in main");
        }
        
        doesNotThrowException();
        
    }
    

}
