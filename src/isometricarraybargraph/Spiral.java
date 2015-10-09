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
public class Spiral extends IABGModel
{

    public Spiral(int numRows, int numColumns) {
        super(numRows, numColumns);
    }

    // fills the board in a spiral pattern starting at the top left and ending in the center.  For example
    // on a 5x7 board:
    // 1  2  3  4  5  6  7
    // 20 21 22 23 24 25 8
    // 19 32 33 34 35 26 9
    // 18 31 30 29 28 27 10
    // 17 16 15 14 13 12 11
    @Override
    protected void fillBoard(int[][] board) 
    {
        
    }
    
}
