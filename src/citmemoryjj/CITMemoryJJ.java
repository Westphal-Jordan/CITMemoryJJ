package citmemoryjj;

public class CITMemoryJJ {
   
    
    public static void main(String[] args){
   
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
