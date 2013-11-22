package citmemoryjj;

public class CITMemoryJJ {
  
    public static void main(String[] args){
   
        Instructions myInstructions = new Instructions();
        myInstructions.displayInstructions();
        
        Menu a = new Menu();
        Menu b = new MainMenuView();
        Menu c = new HelpMenuView();
        Menu d = new GameMenuView();
        
        a.displayClassName();
        b.displayClassName();
        c.displayClassName();
        d.displayClassName();
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.validateInput();
                
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.validateInput();
        
        GameMenuView gameMenuView = new GameMenuView();
        
        Board myBoard = new Board();
        
        Rules myRules = new Rules();
        
        Timer myTimer = new Timer();
        
        GetInput getinput = new GetInput();
        
        PairedProgramming paired = new PairedProgramming();
        
        IndividualProgramming indiv = new IndividualProgramming();
        
    }
   
}
