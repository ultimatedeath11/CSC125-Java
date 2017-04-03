/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbch8;

/**
 *
 * @author NoahFranck
 */

/**
 * Write the definition of a class  ContestResult containing:
An instance variable  winner of type  String , initialized  to the empty String.
An instance variable  secondPlace of type  String , initialized  to the empty 
*   String .
An instance variable  thirdPlace of type  String , initialized  to the empty 
*   String .
A method  called setWinner that has one parameter , whose value  it assigns  
*   to the instance variable  winner.
A method  called setSecondPlace that has one parameter , whose value  it assigns
*   to the instance variable  secondPlace.
A method  called setThirdPlace that has one parameter , whose value  it assigns
*   to the instance variable  thirdPlace.
A method  called getWinner that has no parameters  and that returns the value  
*   of the instance variable  winner.
A method  called getSecondPlace that has no parameters  and that returns the 
*   value  of the instance variable  secondPlace.
A method  called getThirdPlace that has no parameters  and that returns the 
*   value  of the instance variable  thirdPlace.
No constructor  need be defined. 
 * @author NoahFranck
 */
public class ContestResult {
    private String winner = "";
    private String secondPlace = "";
    private String thirdPlace = "";
 
    
    
    public void setWinner(String a){
        winner = a;
    }
    
    public void setSecondPlace(String b){
        secondPlace = b;
    }
    
    public void setThirdPlace(String c){
        thirdPlace = c;
    }
    
    public String getWinner(){
        return winner;
    }
    
    public String getSecondPlace(){
        return secondPlace;
    }
    
    public String getThirdPlace(){
        return thirdPlace;
    }
}
