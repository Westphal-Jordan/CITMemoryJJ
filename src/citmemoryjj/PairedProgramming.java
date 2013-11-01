
package citmemoryjj;

public class PairedProgramming {
    
    int somenum[] = {9,7,6,10,8,3,1,4,5,2};
    int a,b,t;
   
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
}
