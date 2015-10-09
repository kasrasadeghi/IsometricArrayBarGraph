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
public class ColumnMajorFill extends IABGModel
{

    public ColumnMajorFill(int numRows, int numColumns) {
        super(numRows, numColumns);
    }

    // The fill should be column major form - that is fill along one column, then resume fill at the top
    // of the next column.  For example, if board is 3x5, the fill should be:
    // 1 4 7 10 13
    // 2 5 8 11 14
    // 3 6 9 12 15
    @Override
    void fillBoard(int[][] board) 
    {
        int counter = 1;
        for (int j = 0; j < board[1].length; j++) 
            for (int i = 0; i < board.length; i++) 
                board[i][j] = counter++;
    }
    
}
