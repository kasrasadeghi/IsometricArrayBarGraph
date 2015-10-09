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
public class Bustrophedon extends IABGModel
{

    public Bustrophedon(int numRows, int numColumns) {
        super(numRows, numColumns);
    }

    // the fill should go left to right on one row then continue right to left on the next row
    // for example, if the board is 3x5 the fill should be
    // 1  2  3  4  5
    // 10 9  8  7  6
    // 11 12 13 14 15
    @Override
    void fillBoard(int[][] board) 
    {
        
    }
    
}
