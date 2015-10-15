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
public class MultiplicationTable extends IABGModel 
{

    public MultiplicationTable(int numRows, int numColumns) {
        super(numRows, numColumns);
    }

    // fills in a multiplication table starting with 1x1.
    // for example, if board is 3x5 the result should be
    // 1  2  3  4  5
    // 2  4  6  8  10
    // 3  6  8  12 15
    @Override
    void fillBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = (i+1) * (j+1);
            }
        }
    }
    
}
