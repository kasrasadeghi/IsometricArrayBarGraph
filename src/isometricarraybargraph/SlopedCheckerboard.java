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
public class SlopedCheckerboard extends IABGModel
{

    public SlopedCheckerboard(int numRows, int numColumns) {
        super(numRows, numColumns);
    }

    @Override
    void fillBoard(int[][] board) 
    {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) 
                board[i][j] = i + j + 1 + (((i+j)%2 == 1)? 2 : 0);
            
    }
    
}
