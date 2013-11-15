package citmemoryjj;

import java.util.Scanner;
import java.io.Serializable;

public class HelpMenuView implements Serializable {
    
   private static final String[][] menuItems = {
        {"R", "Rules"},
        {"Q", "Quit Help"}
    };
 
   HelpMenuControl helpMenuControl = new HelpMenuControl();
   Rules rules = new Rules();

    public HelpMenuView() {
    }
   
   public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i <HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
    private String getInput() {
        
        Scanner input = new Scanner(System.in);
        String letter;
        letter = input.nextLine();
        
       /* do {
            Scanner ignore = new Scanner(System.in);
        } while(ignore != '\n'); */
        
        return letter;
    }
    
     public void validateInput(){
         
         String command;
         boolean valid = false;
         do {
            this.display();
            command = getInput();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "R":
                    rules.displayRules();
                    break;
                case "Q":
                    System.out.println("You are going to exit this menu.");
                    break;
                default:
                    System.out.println("You have entered an invalid letter. Try again.");
            }
            
         }while(!"Q".equals(command));
     }
}