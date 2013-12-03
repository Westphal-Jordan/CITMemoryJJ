package citbyui.cit260.citmemoryjj.menu;

import citbyui.cit260.citmemoryjj.menu.MainMenuControl;
import citbyui.cit260.citmemoryjj.menu.HelpMenuView;
import citbyui.cit260.citmemoryjj.menu.Menu;
import java.util.Scanner;
import java.io.Serializable;

public class MainMenuView extends Menu implements Serializable {
    
    private static final String[][] menuItems = {
        {"B", "Begin Game"},
        {"H", "Help"},
        {"X", "Exit Memory"}
    };
 
    MainMenuControl mainMenuControl = new MainMenuControl();

    public MainMenuView() {
    }

    public static String[][] getMenuItems() {
        return menuItems;
    }

    public MainMenuControl getMainMenuControl() {
        return mainMenuControl;
    }

    public void setMainMenuControl(MainMenuControl mainMenuControl) {
        this.mainMenuControl = mainMenuControl;
    }
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
    private static String getInput() {
        
        Scanner input = new Scanner(System.in);
        String letter;
        letter = input.nextLine();
        
       /* do {
            Scanner ignore = new Scanner(System.in);
        } while(ignore != '\n'); */
        
        return letter;
    }
    
    public void validateInput() {       
        
        String command;
        
        boolean valid = false;
        do {
            this.display();
            command = MainMenuView.getInput();
            command = command.trim().toUpperCase();
            switch (command) {
                case "B":
                    System.out.println("You are going to begin the game.");
                    break;
                case "H":
                    HelpMenuView helpMenu = new HelpMenuView();
                    helpMenu.display();
                    break;
                case "X":
                    System.out.println("You are trying to exit the game.");
                default:
                    System.out.println("You have entered an invalid character. Try again.");
            }
        }while (!"X".equals(command));
     }
    
    @Override
    public void displayClassName() {
        System.out.println("Class name: MainMenuView");
    }
    
}


            