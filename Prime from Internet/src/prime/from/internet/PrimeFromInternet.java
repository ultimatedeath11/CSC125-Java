/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime.from.internet;

/**
 *
 * 
 */
public class PrimeFromInternet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 10000; i++)
        {
            int factors = 0;
            int j = 1;

            while(j <= i)
            {
                if(i % j == 0)
                {
                    factors++;
                }
                j++;
            }
            if (factors == 2)
            {
                System.out.println(i);
            }
        }
    }
}
   
