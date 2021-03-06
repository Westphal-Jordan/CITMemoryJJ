package citbyui.cit260.citmemoryjj.assignments;

import citbyui.cit260.citmemoryjj.interfaces.WeekTen;
import java.util.Scanner;

public class PairedProgramming implements WeekTen {
    
    private int somenum[] = {9,7,6,10,8,3,1,4,5,2};
    private int a,b,t;
   
     public void sortAndDisplay(){
         for(a = 1; a < somenum.length; a++)
             for(b = somenum.length - 1; b >= a; b--) {
               if(somenum[b-1] > somenum[b]){
                   t = somenum[b-1];
                   somenum[b-1] = somenum[b];
                   somenum[b] = t;
               }
             }
         System.out.print("Sorted array is:");
        for(int i = 0; i < somenum.length; i++)
            System.out.print(" " + somenum[i]);
        System.out.println();
        
     }
     
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
     
    private class weekEight {
            
            private void weekEightMethod() {
               System.out.println("This is just to show how nested classes work."); 
            }
            
    }
        
    @Override
    public void showInfo() {
        System.out.println("This is an override from the PairedProgramming class"
                           + " using the interface class WeekTen.");
    }
    
     public void notANumber() {
        
      Scanner input = new Scanner(System.in);
      int one = 1;
      
      do{
      try {
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        System.out.println("Thank you.");
        one = 2;
      }
      catch (Exception e) {
        System.out.println("That is not a number. Please try again.");
      }
      }while (one == 1);
    }
    
}
