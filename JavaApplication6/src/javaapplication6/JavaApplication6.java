/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author noah.franck
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		int continent = 4;
    
    switch (continent) {
       case'1':System.out.println("North America: Mexico City, Mexico");
        break;
        case'2': System.out.println("South America: Sao Paulo, Brazil");
        break;
        case'3':System.out.println("Europe: Moscow, Russia");
        break;
        case'4': System.out.println("Africa: Lagos, Nigeria");
        break;
        case'5':System.out.println("Asia: Shanghai, China");
        break;
        case'6':System.out.println("Australia: Sydney Australia");
        break;
        case'7':System.out.println("Antartica: McMurdo station, US");
        break;
      default:System.out.println("Undefined continent!");
        
        
    }		

	}
}


