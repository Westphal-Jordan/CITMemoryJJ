/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citmemoryjj;

public class Rules {

    String rules = "\nRULES:\n"
            + "\n"
            + "For one player: \n"
            + "1. Choose a card and remember the image. \n"
            + "2. Choose a second card. If that image matches the image of the "
            + "first card, you receive a point. If it does not, the first and "
            + "second cards are flipped over and you must try again.\n"
            + "3. Try and find all the pairs of images in the least amount of "
            + "time possible."
            + "\n\n" 
            + "For two or more players: \n" 
            + "1. Players take a turn one at a time.\n"
            + "2. On each turn, a player turns over two cards (one at a time)"
            + "and keeps them if they match. \n"
            + "3. If they successfully match a pair of numbers, that player also"
            + "gets to take another turn. \n"
            + "4. They continue taking turns until the last match is found. \n"
            + "5. The computer then tallies up the number of matches each person "
            + "got.\n"
            + "6. The person with the highest number of matches is the winner.";
            

    public void displayRules() {

        System.out.println(rules);
    }
    
    public void individualAssignment3() {
        
        // This function is for the individual programming assignment for week 3. 
        
        int radius = 3;
        double pi = 3.14;
        double area;
        byte i = 0;
        
        area = pi * radius * radius;
        area = (int) area;
        
        for (; i < 5; i++) {
            
            System.out.println("The area of a circle, rounded to the nearest "
                    + "whole number, with a radius of 3 inches is " 
                    + area + " inches squared.");
        }

        System.out.println("...but I guess after telling you that five times, "
                + "you know that by now, right? \n "
                + "I don't want to be a \"pest\".");
    }
    
}
