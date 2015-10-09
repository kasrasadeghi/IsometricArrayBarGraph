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
public abstract class IABGModel 
{
    private int [][] board;
    
    public IABGModel( int numRows, int numColumns )
    {
        board = new int[numRows][numColumns];
        
        fillBoard( board );
    }
    
    abstract void fillBoard( int [][] board );
    
    public int getNumRows() { return board.length; }
    public int getNumColumns() { return board[0].length; }
    
    public int getItem( int r, int c ) { return board[r][c]; }
    
    protected int [][] getBoard() { return board; }
}
