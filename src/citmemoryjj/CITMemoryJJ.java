package citmemoryjj;

import citbyui.cit260.citmemoryjj.assignments.PairedProgramming;
import citbyui.cit260.citmemoryjj.assignments.IndividualProgramming;
import citbyui.cit260.citmemoryjj.menu.MainMenuView;
import citbyui.cit260.citmemoryjj.menu.MainMenuControl;
import citbyui.cit260.citmemoryjj.menu.HelpMenuView;
import citbyui.cit260.citmemoryjj.menu.GameMenuView;
import citbyui.cit260.citmemoryjj.menu.GameMenuControl;
import citbyui.cit260.citmemoryjj.menu.Menu;
import citbyui.cit260.citmemoryjj.interfaces.DisplayInfo;
import citbyui.cit260.citmemoryjj.interfaces.EnterInfo;
import citbyui.cit260.citmemoryjj.interfaces.WeekTen;
import citbyui.cit260.citmemoryjj.frames.MainFrame;

public class CITMemoryJJ {
  
   // private MainCommands = new MainCommands;
    
    public static void main(String[] args){
        
        MainFrame main = new MainFrame();
        main.setVisible(true);
        
        Instructions myInstructions = new Instructions();
        myInstructions.displayInstructions();
        
        
        // Paired Programming week 9
        /*
        Menu a = new Menu();
        Menu b = new MainMenuView();
        Menu c = new HelpMenuView();
        Menu d = new GameMenuView();
        
        a.displayClassName();
        b.displayClassName();
        c.displayClassName();
        d.displayClassName();
       
        // Jordan's Individual Assignment week 9
        
        Jordan one = new Jordan();
        Jordan two = new IndividualProgramming();
        Jordan three = new Instructions();
        Jordan four = new Player();
        
        two.forJordanClass();
        three.forJordanClass();
        one.forJordanClass();
        four.forJordanClass();
        
        // Jaqueline Individual Assignment week 9
        
        Flower yellow = new Flower();
        Flower red = new GameMenuControl();
        Flower white = new GetInput();
        Flower blue = new MainMenuControl();
        
        yellow.colorFlower();
        red.colorFlower();
        white.colorFlower();
        blue.colorFlower();
        */
        
        /* Paired Programming Week 10
        Menu e = new Menu();
        Menu f = new Menu();
        
        e.displayStuff();
        f.getUserInput(); */
        
        /* Paired Programming Week 11
        PairedProgramming weekEleven = new PairedProgramming();
        weekEleven.notANumber(); */
        
        /*
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
        */
    }
   
}
