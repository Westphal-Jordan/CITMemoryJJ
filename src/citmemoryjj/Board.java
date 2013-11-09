
package citmemoryjj;

public class Board {
    
    public void displayBoard() {

       int board[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
       };
       
        
       System.out.println(
                "\n\t" + board[0][0] + "  | " + board[0][1] + "  | " + board[0][2] + "  | " + board[0][3] + "\n"
              + "\t" + board[1][0] + "  | " + board[1][1] + "  | " + board[1][2] + "  | " + board[1][3] + "\n"
              + "\t" + board[2][0] + "  | " + board[2][1] + " | " + board[2][2] + " | " + board[2][3] + "\n"
              + "\t" + board[3][0] + " | " + board[3][1] + " | " + board[3][2] + " | " + board[3][3] + "\n"
                );
    }
}
