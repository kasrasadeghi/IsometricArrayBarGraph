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
public class Paraboloid extends IABGModel
{

    public Paraboloid(int numRows ) {
        super(numRows, numRows);
    }

    // forms a paraboloid - see picture in lab notes.  Each row and each column is a parabola with its
    // vertex at the center of the row/column
    @Override
    void fillBoard(int[][] board) {
        
    }
    
}
