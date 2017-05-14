/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NoahFranck
 */
public class UsingChainedExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            method1();
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }
    
    public static void method1() throws Exception{
        try {
            method2();
        }catch(Exception exception){
            throw new Exception("Exception thrown in method1", exception);
        }
    }
    
    public static void method2() throws Exception{
        try {
            method3();
        }catch(Exception exception){
            throw new Exception("Exception thrown in method2", exception);
        }
    }
    
    public static void method3() throws Exception{
        throw new Exception("Exception thrown in method3");
    }
    
}
