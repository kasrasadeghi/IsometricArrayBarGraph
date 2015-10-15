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
public class RowMajorFill extends IABGModel
{

    public RowMajorFill(int numRows, int numColumns) {
        super(numRows, numColumns);
    }

    // fills the board in row-major form. That is, fill in the top left square, go to the right
    // resume counting on the left side of the next row etc.  For example (3x5):
    // 1  2  3  4  5
    // 6  7  8  9  10
    // 11 12 13 14 15
    @Override
    void fillBoard(int[][] board) 
    {
        int counter = 1;
        for (int i = 0; i < board.length; i++) 
            for (int j = 0; j < board[i].length; j++) 
                board[i][j] = counter++;
    }
    
}
