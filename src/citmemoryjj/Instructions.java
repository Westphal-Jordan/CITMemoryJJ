package citmemoryjj;

public class Instructions extends Jordan {
    
    public void displayInstructions() {
        
       String name;
       String instructions = "Welcome to Memory! \n"
            + "Flip a card and try and match the picture on it to another card. \n"
            + "Keep playing and try and beat your best time. \n"
            + "Good luck!";
       String asterisks = "***************";
       
       System.out.println(instructions);
    }
    
    @Override
    public void forJordanClass() {
        System.out.println("like");
    }
}
