
package citmemoryjj;

public class IndividualProgramming extends Jordan {
    
    public void computeSum() {
        
        int[] numbers = {1,2,3,4,5};
        int sum = 0;
    
        for (int a : numbers) {
            sum += a;
        }
        System.out.println("The sum of 1, 2, 3, 4 and 5 is " + sum + ".");
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
   
    public void jordanWestphalIndivAssign5() {
    
     String process[] = {"This ", "should ", "show ", "how", "an ", "array ",  
        "works ", "with ", "a ", "for ", "loop."}; // a for loop that iterates through a list
   
        for (int counter = 0; counter < process.length; counter++){
            System.out.println(process[counter]);
        }
    }
    
    @Override
    public void showClassName() {
        System.out.println("I");
    }
}
