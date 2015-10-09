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
        
    }
    
}
