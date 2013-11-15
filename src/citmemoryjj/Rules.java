package citmemoryjj;

import java.io.Serializable;

public class Rules implements Serializable {

    private static String rules = "\nRULES:\n"
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
            

    public Rules() {
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }
    
    public void displayRules() {

        System.out.println(rules);
    }
    
}
