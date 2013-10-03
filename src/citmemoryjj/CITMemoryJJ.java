/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citmemoryjj;

import java.util.Scanner;
/**
 *
 * @author Family
 */
public class CITMemoryJJ {
    
    String name;
    String instructions = "Welcome to Memory! \n"
            + "Flip a card and try and match the picture on it to another card. \n"
            + "Keep playing and try and beat your best time. \n"
            + "Good luck!";
   
    public static void main(String[] args) {
        CITMemoryJJ myGame = new CITMemoryJJ();
        myGame.getName();
        myGame.displayHelp();
    }
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
}
