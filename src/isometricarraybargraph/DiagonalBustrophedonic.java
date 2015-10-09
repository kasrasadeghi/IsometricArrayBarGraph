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
public class DiagonalBustrophedonic extends IABGModel
{

    public DiagonalBustrophedonic(int numRows, int numColumns) {
        super(numRows, numColumns);
    }
    
    // like the bustophedon fill but going diagonally instead of left-right-left.
    // for example, if the board is 3x5 the fill should be
    // 1  2  6  7  12
    // 3  5  8  11 13
    // 4  9  10 14 15
    protected void fillBoard( int [][] board )
    {
        
    }
    
}
