/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citmemoryjj;

/**
 *
 * @author Family
 */
public class Timer {
    
    
    public void displayEquation() {
    /* Not sure how to create a timer yet, and this is the only real calculation
    * that would be in our program, so we placed a function here to satisfy the paired
    * programming assignment for week 3 in the mean time.
    */
        int two = 2;
        double threepointfive = 3.5;
        int result = 5; 
        
        result += (int) (threepointfive) * two; 
        
        if (result < 12) {
            System.out.println("\tCongratulations! This is working.\n" 
                    + "\tBecause of casting, the value of result is " + result
                    + " when it would ordinarily be 12.");
         }
        
        else {
            System.out.println("\tOops! Something went wrong.");
        }
    }
}