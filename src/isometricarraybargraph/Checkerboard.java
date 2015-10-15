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
public class Checkerboard extends IABGModel
{

    public Checkerboard(int numRows, int numColumns) {
        super(numRows, numColumns);
    }

    // the fill should be 1's and 2's in a checkerboard pattern:
    // 1 2 1 2 1
    // 2 1 2 1 2
    // 1 2 1 2 1
    @Override
    void fillBoard(int[][] board) 
    {
        for (int i = 0; i < board.length; i++) 
            for(int j = 0; j < board.length; j++) 
                board[i][j] = ((i+j)%2 == 0) ? 1 : 2;
    
    }
    
}
