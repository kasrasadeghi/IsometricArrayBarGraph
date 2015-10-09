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
public class AlternatingStairs extends IABGModel
{

    public AlternatingStairs(int numRows, int numColumns) {
        super(numRows, numColumns);
    }

    // fills the board with alternating stair cases.  
    // That is, the first row should be ascending stairs 1, 2, 3, ... N
    // the next row should be a descending stairs, N, N-1, N-2, ... 1
    // And then alternate between ascending and descending on each row.
    // For example, if the board is 3x5, the fill should be
    // 1 2 3 4 5
    // 5 4 3 2 1
    // 1 2 3 4 5
    @Override
    void fillBoard(int[][] board) 
    {
       
        
    }
    
}
