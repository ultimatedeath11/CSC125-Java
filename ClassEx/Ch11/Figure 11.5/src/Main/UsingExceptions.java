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
    
    //demonstrates try...catch...finally
    private static void throwException() throws Exception {
        try{
            System.out.println("Method throwException");
            throw new Exception(); //generate exception
        }catch(Exception exception){
            System.err.println("Exception handled in method throwException");
            throw exception;//rethrow for further processing
            
            //code here is not reachable and would cause a compile error. 
            
        }finally//executes reguardless of what occurs in the try...catch
        {
            System.err.println("Finally executed in throwException");
        }
        //cod ehere would not be reached and would cause a compile error. 
    }

   
}
