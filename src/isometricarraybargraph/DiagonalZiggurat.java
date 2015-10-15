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
public class DiagonalZiggurat extends IABGModel
{

    public DiagonalZiggurat(int numRows, int numColumns) {
        super(numRows, numColumns);
    }

    // Example for a board which is 9x10:
    // 1  3  3  5  5  7  7  9  9  11
    // 3  3  5  5  7  7  9  9  11 11
    // 3  5  5  7  7  9  9  11 11 13
    // 5  5  7  7  9  9  11 11 13 13
    // 5  7  7  9  9  11 11 13 13 15
    // 7  7  9  9  11 11 13 13 15 15
    // 7  9  9  11 11 13 13 15 15 17
    // 9  9  11 11 13 13 15 15 17 17
    // 9  11 11 13 13 15 15 17 17 19
    @Override
    void fillBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) 
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = (i + j)/2 * 2 + 1;
            }
    }
    
}
