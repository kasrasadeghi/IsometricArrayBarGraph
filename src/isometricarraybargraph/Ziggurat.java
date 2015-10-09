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
public class Ziggurat extends IABGModel
{

    public Ziggurat(int numRows, int numColumns) {
        super(numRows, numColumns);
    }

    // fills in a ziggurat shape where the outer ring is 1's, the next ring in is 2's, the next ring is 3's etc:
    // 1 1 1 1 1 1
    // 1 2 2 2 2 1
    // 1 2 3 3 2 1
    // 1 2 2 2 2 1
    // 1 1 1 1 1 1
    @Override
    void fillBoard(int[][] board) 
    {
        
    }
    
}
