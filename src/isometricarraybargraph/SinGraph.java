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
public class SinGraph extends IABGModel
{
    private double t;

    public SinGraph(int numRows, int numColumns) 
    {
        super(numRows, numColumns);
        t = 0;
    }

    // fills with an interesting sin function. (see, for example the sin function from the bar graph lab,
    // but in corporate both the row and column indices as well as t)
    // Also, set the bottom left entry to be 400 (this helps keep the scale constant)
    @Override
    protected void fillBoard(int[][] board) 
    {
        
        
    }
    
    public void moveT( int dt )
    {
        t += dt/100.0;
        fillBoard( getBoard() );
    }
}
