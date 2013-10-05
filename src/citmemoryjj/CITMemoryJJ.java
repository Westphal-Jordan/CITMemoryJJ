
package citmemoryjj;

import java.util.Scanner;

public class CITMemoryJJ {
    
    String name;
    String instructions = "welcome to Memory! \n"
            + "Flip a card and try and match the picture on it to another card. \n"
            + "Keep playing and try and beat your best time. \n"
            + "Good luck!";
    String asterisks = "***************";
           
   
    public static void main(String[] args) {
        CITMemoryJJ myGame = new CITMemoryJJ();
        myGame.getName();
        myGame.displayHelp();
        
        Menu myMenu = new Menu();
        myMenu.displayMenu();
        
        Board myBoard = new Board();
        myBoard.displayBoard();
        
        Rules myRules = new Rules();
        myRules.displayRules();
        
    }
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    
    public void displayHelp() {
        System.out.println("\n" + this.asterisks);
        System.out.println("Hello " + this.name + ", " + this.instructions);
        System.out.println(this.asterisks + "\n");
    }
}
