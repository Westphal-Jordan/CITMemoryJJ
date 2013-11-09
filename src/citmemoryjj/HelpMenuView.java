package citmemoryjj;

import java.util.Scanner;

public class HelpMenuView {
    
    public void displayHelpMenu() {
        String menuItems = "\n==================================================\n"
                + "\tHELP MENU\n" 
                + "Enter a letter associated with one of the following "
                + "commands and press enter:\n"
                + "R -- Rules\n"
                + "Q -- Quit Help\n"
                + "====================================================";
        
        System.out.println(menuItems);
    }
    
    HelpMenuControl helpMenuControl = new HelpMenuControl();
    Rules rules = new Rules();
    
    private char getInput() {
        
        Scanner input = new Scanner(System.in);
        char letter;
        letter = input.next().charAt(0);
        
       /* do {
            Scanner ignore = new Scanner(System.in);
        } while(ignore != '\n'); */
        
        return letter;
    }
    
     public void validateInput(){
         
         char command;
         
         do {
            this.displayHelpMenu();
            command = getInput();
            
            switch (command) {
                case 'r':
                    rules.displayRules();
                    break;
                case 'q':
                    System.out.println("You are going to exit this menu.");
                    break;
                default:
                    System.out.println("You have entered an invalid letter. Try again.");
            }
            
         }while(command != 'r' || command != 'q');
     }
}