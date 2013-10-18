/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    public char getInput() 
      throws java.io.IOException {
        
        char command, ignore;
        command = (char) System.in.read();
        
        
        do {
            ignore = (char) System.in.read();
        } while(ignore != '\n');
        
        return command;
    }
    
     public void validateInput()
     throws java.io.IOException {
         
         char command = getInput();
         char r = 'r';
         char q = 'q';
         
         do {
            displayHelpMenu();
            getInput();
            
            if(command == r){
                System.out.println("You've chosen the rules option.");
            }
            else if (command == q){
                System.out.println("You are going to exit this menu.");
            }
            else
                System.out.println("You've entered an invalid letter. Try again.");
         }while(command != r || command != q);
     }
}