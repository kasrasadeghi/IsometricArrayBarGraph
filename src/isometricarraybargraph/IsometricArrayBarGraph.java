/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package isometricarraybargraph;

import apcscvm.CVMProgram;
import apcscvm.Control;
import apcscvm.DefaultControl;
import apcscvm.View;

/**
 *
 * @author DSTIGANT
 */
public class IsometricArrayBarGraph {

    public static void launch( String title, IABGModel m )
    {
        new CVMProgram( title + " " + m.getNumRows() + " x " + m.getNumColumns(), 
                800, 800, new DefaultControl<>(), new IABGView(), m ).start();
       
    }
    
    public static void launch( String title, Control c, View v, IABGModel m )
    {
        new CVMProgram( title + " " + m.getNumRows() + " x " + m.getNumColumns(), 
                800, 800, c, v, m ).start();
    }
    
    public static int AbsDiff( int a, int b )
    {
        return Math.abs( a - b );
    }
    
    public static int AbsDiffHard( int a, int b )
    {
        return (2*((a+1)%(b+1)/(a+1))-1)*(b-a);
    }
    
    public static void main(String[] args) {
//        launch( "RMF", new RowMajorFill(6,4) );
//        launch( "CMF", new ColumnMajorFill(6,4) );
//        launch( "Addition", new AdditionTable(6,4) );
//        launch( "Multiplication", new MultiplicationTable( 10, 10 ) );
//        launch( "Checkerboard", new Checkerboard( 8, 8 ) );
//        launch( "SlopedCheckerboard", new SlopedCheckerboard( 8, 8 ) );
//        launch( "AlternatingStairs", new AlternatingStairs(9, 13) );
//        launch( "BP", new Bustrophedon(6, 4) );
//        launch( "Ziggurat", new Ziggurat( 12, 9 ) );
//        launch( "Tartan", new Tartan( 9, 13 ) );
//        launch( "Pascal", new PascalTriangle( 6, 6 ) );
//        launch( "DiagonalZiggurat", new DiagonalZiggurat( 8, 8 ) );
//        launch( "Sin Graph", new SinGraphControl(), new SinGraphView(), new SinGraph( 50, 50 ) );
//        launch( "Paraboloid", new Paraboloid( 17 ) );
//        launch( "CrazyStairs", new CrazyStairs(20) );
//        launch( "DB", new DiagonalBustrophedonic(5, 10) );
        launch( "Spiral", new Spiral( 9, 9 ) );
    }
    
}
