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
        int counter = 1;
        int rn = board.length;      //row number
        int cn = board[0].length;   //column number
        
        int r = 0;
        int c = 0;
        int dr = 0;
        int dc = 1;
        
        while (counter < rn * cn + 1 ) {
            board[r][c] = counter++;
            
            //if we hit the right edge or some numbers on the right
            // and we're travelling right head down
            // from 0 1 to 1 0
            if ( dr == 0 && dc == 1) {
                if( c == cn-1) {
                    dr++;
                    dc--;
                }
                else if ( board[r][c+1] != 0) {
                    dr++;
                    dc--;
                }
            }
            
            //if we hit the bottom edge or some numbers on the bottom 
            // and we're travelling down head left
            // from 1 0 to 0 -1
            if ( dr == 1 && dc == 0) {
                if( r == rn-1) {
                    dr--;
                    dc--;
                }
                else if ( board[r+1][c] != 0) {
                    dr--;
                    dc--;
                }
            }
            
            //if we hit the left edge or some numbers on the left 
            // and we're travelling left head up
            // from 0 -1 to -1 0
            if ( dr == 0 && dc == -1) {
                if( c == 0) {
                    dr--;
                    dc++;
                }
                else if ( board[r][c-1] != 0) {
                    dr--;
                    dc++;
                }
            }
            
            //if we hit some numbers on the top and we're heading up
            // head right
            // from -1 0 to 0 1
            if ( dr == -1 && dc == 0) {
                if( r == 0) {
                    dr++;
                    dc++;
                }
                else if ( board[r-1][c] != 0) {
                    dr++;
                    dc++;
                }
            }
            
            r += dr;
            c += dc;
        }
    }
}
