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
public class Tartan extends IABGModel
{

    public Tartan(int numRows, int numColumns) {
        super(numRows, numColumns);
    }

    // kind of like checkerboard but with isolated 1's:
    // 2 2 2 2 2 2 2 2 2 2 2
    // 2 1 2 1 2 1 2 1 2 1 2
    // 2 2 2 2 2 2 2 2 2 2 2
    // 2 1 2 1 2 1 2 1 2 1 2
    // 2 2 2 2 2 2 2 2 2 2 2
    @Override
    void fillBoard(int[][] board) {
        for (int i = 0; i < board.length; i++ )
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = (i%2 == 0) ? 2 :
                        (j%2 == 0) ? 2 : 1;
            }
    }
    
}
