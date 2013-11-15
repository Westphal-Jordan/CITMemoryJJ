
package citmemoryjj;

import java.util.Scanner;

public class CITMemoryJJ {
   
    String name;
    
    public static void main(String[] args){
        CITMemoryJJ myGame = new CITMemoryJJ();
      
        Instructions myInstructions = new Instructions();
        myInstructions.displayInstructions();
        
        MainMenuView mainmenu = new MainMenuView();
        mainmenu.validateInput();
                
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.validateInput();
        
        Board myBoard = new Board();
        
        Rules myRules = new Rules();
        
        Timer myTimer = new Timer();
        
        GetInput getinput = new GetInput();
        
        PairedProgramming paired = new PairedProgramming();
        
        IndividualProgramming indiv = new IndividualProgramming();
        
    }
   
}
