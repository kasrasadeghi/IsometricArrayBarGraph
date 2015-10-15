/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package isometricarraybargraph;

/**
 *
 * @author DSTIGANT
 */
public class CrazyStairs extends IABGModel
{
    public CrazyStairs( int n )
    {
        super( 4*n-3, 4*n-3 );
    }
    
    // the fill should form a diamond pattern of staircases.  The board will be square
    // with dimensions 4N-3 x 4N-3 where N is the length of the staircase.  If N is 5, the 
    // board will be 17x17, and the result should be:
    // . . . . . . . . 5 . . . . . . . .
    // . . . . . . . 4 . 4 . . . . . . .
    // . . . . . . 3 . . . 3 . . . . . .
    // . . . . . 2 . . . . . 2 . . . . .
    // . . . . 1 . . . . . . . 1 . . . .
    // . . . 2 . 2 . . . . . 2 . 2 . . .
    // . . 3 . . . 3 . . . 3 . . . 3 . .
    // . 4 . . . . . 4 . 4 . . . . . 4 .
    // 5 . . . . . . . 5 . . . . . . . 5
    // . 4 . . . . . 4 . 4 . . . . . 4 .
    // . . 3 . . . 3 . . . 3 . . . 3 . .
    // . . . 2 . 2 . . . . . 2 . 2 . . .
    // . . . . 1 . . . . . . . 1 . . . .
    // . . . . . 2 . . . . . 2 . . . . .
    // . . . . . . 3 . . . 3 . . . . . .
    // . . . . . . . 4 . 4 . . . . . . .
    // . . . . . . . . 5 . . . . . . . .
    // (.'s should be 0's, but using .'s makes the pattern more evident)
    @Override
    void fillBoard(int[][] board) 
    {
        int l = board.length;
        int n = (l + 3)/4;
        int counter = n;
        for (int i = 0; i < n; i++) {
            board[l/2 - i][i] = counter;
            board[l/2 + i][i] = counter--;
        }
        counter++; counter++;
        for (int i = 0; i < n - 1; i++) {
            board[l/2 - n - i][i + n] = counter;
            board[l/2 - n + i + 2][i + n] = counter;
            board[l/2 + n - i - 2][i + n] = counter;
            board[l/2 + n + i][i + n] = counter++;
        }
        counter--;
        for (int i = 1; i < n; i++) {
            board[i][i + 2*n - 2] = --counter;
            board[l - 1 - i][i + 2*n - 2] = counter;
            board[l/2 - i][i + 2*n - 2] = counter;
            board[l/2 + i][i + 2*n - 2] = counter;
        }
        counter++;
        for (int i = n - 2; i > -1; i--) {
            board[l/2 + i][l - 1 - i] = counter;
            board[l/2 - i][l - 1 - i] = counter++;
        }
    }
    
}
