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

    //demonstrate finally when no exception occurs
    private static void doesNotThrowException() {
        try//try block does not throw an exception
        {
            System.out.println("Method doesnotThrowException");
        }catch(Exception exception) //does not execute
        {
            System.err.println(exception);
        }finally//executes reguardless of what occurs in try..catch 
        {
            System.err.println("Finally excuted in doesNotThrowException");
        }
        
        System.out.println("end of Method doesNotThrowException");
    }
}
