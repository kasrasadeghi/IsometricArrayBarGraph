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
    @Override
    protected void fillBoard( int [][] board )
    {
        
        //movements is a vector field. it tells the loop where to look next.
        
        int [][] movements = new int [board.length][board[0].length]; 
        // 1 is right
        // 2 is downleft
        // 3 is down
        // 4 is upright
        
        
        for ( int i = 0; i < movements.length; i++) {
            for( int j = 0; j < movements[i].length; j++) {
                
                if ((i+j)%2 == 0 
                        && i != 0 
                        && j != movements[0].length-1)
                    movements[i][j] = 4;
                
                if ((i+j)%2 == 1 
                        && j != 0 
                        && i != movements.length-1)
                    movements[i][j] = 2;
                
                if (j != movements[0].length-1){
                    if (i == 0 && j%2 == 0)
                        movements[i][j] = 1;
                    if (i == movements.length-1 && (i+j)%2 == 1)
                        movements[i][j] = 1;
                }
                
                if (i != movements.length-1) {
                    if (j == 0 && i%2 == 1)
                        movements[i][j] = 3;
                    if (j == movements[0].length-1 && (i+j)%2 == 0)
                        movements[i][j] = 3;
                }
            }
        }
        int counter = 1;
        int r = 0;
        int c = 0;
        while (counter < board.length * board[0].length + 1) {
            board[r][c] = counter++;
            int movement = movements[r][c];
            switch(movement) {
                case 1: c++; break;
                case 2: c--; r++; break;
                case 3: r++; break;
                case 4: c++; r--; break;
            }
        }
    }
}
