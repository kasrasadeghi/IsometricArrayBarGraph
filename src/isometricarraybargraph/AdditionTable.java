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
public class AdditionTable extends IABGModel
{

    public AdditionTable(int numRows, int numColumns) {
        super(numRows, numColumns);
    }

    // fills the board with an addition table starting at 1 + 1
    // for example, if the board is 3x5, then the fill should be:
    // 2 3 4 5 6
    // 3 4 5 6 7
    // 4 5 6 7 8
    @Override
    void fillBoard(int[][] board) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = i + j + 2;
            }
    }
    
}
