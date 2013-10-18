/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citmemoryjj;

/**
 *
 * @author Family
 */
public class Instructions {
    
    public void displayInstructions() {
        
       String name;
       String instructions = "welcome to Memory! \n"
            + "Flip a card and try and match the picture on it to another card. \n"
            + "Keep playing and try and beat your best time. \n"
            + "Good luck!";
       String asterisks = "***************";
       
       System.out.println(instructions);
    }
}
