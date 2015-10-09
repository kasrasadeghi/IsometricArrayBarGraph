/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isometricarraybargraph;

import java.awt.Color;

/**
 *
 * @author DSTIGANT
 */
public class SinGraphView extends IABGView
{
    @Override
    protected Color getColor( int bh )
    {
        return new Color( Math.min(bh*255/375, 255), 0, 0 );
    }
}
