/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package waerpump;
import java.util.Scanner ;

/**
 *
 * @author amsta5248
 */
public class Waerpump {
   
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //constant 
        final double WATER_COMPUTER = 1.5; 
        
        Scanner Keyboard= new Scanner (System.in);
        
        // varaiables
        
        double monitor;
        double tons;
        
        System.out.println("Pleas enter the number of computer monitors you have ");
        monitor = Keyboard.nextDouble();
        
        // equation
        
        tons = monitor* WATER_COMPUTER;
                
          //output
                
          System.out.println("The total number of twater in tons is " + tons );
                
        
       
        
        // TODO code application logic here
    }
    
}
