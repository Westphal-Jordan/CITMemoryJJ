
package citmemoryjj;

import java.util.Scanner;

public class CITMemoryJJ {
   
    String name;
    
    public static void main(String[] args){
        CITMemoryJJ myGame = new CITMemoryJJ();
        myGame.getName();
        myGame.displayName();
      
        Instructions myInstructions = new Instructions();
        myInstructions.displayInstructions();
        
        Menu myMenu = new Menu();
        
        Board myBoard = new Board();
        
        Rules myRules = new Rules();
        
        Timer myTimer = new Timer();
        
        HelpMenuView helpMenu = new HelpMenuView();
        // helpMenu.
        
                
        GetInput getinput = new GetInput();
        getinput.getPosition();
    }
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    
    public void displayName() {
        System.out.println("\nHello " +this.name + ", ");
    }
}
