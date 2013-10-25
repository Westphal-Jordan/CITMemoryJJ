package citmemoryjj;

import java.util.Scanner;

public class GetInput {
    
 public String getPosition(){
   
    Scanner input = new Scanner(System.in); // the variable 'input' is equal to what the user inputs
    int position1, position2; // declare variable  
    System.out.println("\nPlease choose the position of a card. It must be between 1 and 16.");
    position1 = input.nextInt(); //  making variable 'position' equal to input
    
    while(position1 < 1 || position1 > 16) {
   
        System.out.println("That is not a valid card number. Please enter a card number between 1 and 16.");    
        position1 = input.nextInt();
   
    }
   
    System.out.println("Now choose a second card number between 1 and 16.");
    position2 = input.nextInt();
    
    while(position2 < 1 || position2 > 16 || position2 == position1) {
    
        System.out.println("That is not a valid card number, or you may have already entered it. Please enter a card number between 1 and 16.");    
        position2 = input.nextInt();
    }
    
    String output = "You chose the cards " + position1 + " and " + position2 + ".";
    
    return output;
 
 }

}