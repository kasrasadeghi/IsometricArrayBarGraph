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
public class PascalTriangle extends IABGModel
{

    public PascalTriangle(int numRows, int numColumns) {
        super(numRows, numColumns);
    }

    // fills in pascal's triangle (every entry is the sum of the 2 entries above and to the left of this entry)
    // for example, if board is 4x4, the result should be
    // 1  1  1  1
    // 1  2  3  4
    // 1  3  6  10
    // 1  4  10 20 
    @Override
    void fillBoard(int[][] board) {
        
    }
    
}
