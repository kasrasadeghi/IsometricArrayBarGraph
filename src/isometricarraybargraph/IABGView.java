/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package isometricarraybargraph;

import apcscvm.GraphicsUtilityFunctions;
import apcscvm.View;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

/**
 *
 * @author DSTIGANT
 */
public class IABGView implements View<IABGModel>
{
    
    private static Color [] colors = {
        Color.RED,
        Color.ORANGE,
        Color.YELLOW,
        Color.GREEN,
        Color.BLUE,
        new Color( 128, 0, 128 ),
    };
    
    protected Color getColor( int bh )
    {
        return colors[bh%colors.length];
        
    }
    
    @Override
    public void paint(IABGModel m, Graphics g, int w, int h) 
    {   
        int r = m.getNumRows();
        int c = m.getNumColumns();
        
        double x = Math.min(    w/((r+c)*Math.cos(Math.PI/6)),
                                h/((r+c)*Math.sin(Math.PI/6)));
        
        double topW = x/Math.sqrt(2); 
        double topH = x/Math.sqrt(2); 
        
        
        BufferedImage top = new BufferedImage( (int)topW, (int)topH, BufferedImage.TYPE_4BYTE_ABGR );
        Graphics2D gr = top.createGraphics();
        gr.setBackground( new Color( 255, 255, 255, 0 ) );
        gr.setColor(Color.BLACK );
        
        Font f = GraphicsUtilityFunctions.getFont( (int)(3*topH/5) );
        
        
        AffineTransform s = AffineTransform.getScaleInstance( x*Math.sqrt(6)/(2*topH), 1 );
        AffineTransform t = AffineTransform.getRotateInstance( - Math.PI/4 );
        s.concatenate(t);
        
        Graphics2D g2D = (Graphics2D)g;
        
        double xf = c*x*Math.cos(Math.PI/6);
        
        double minZUnit = Double.MAX_VALUE;
        
        for ( int i = 0; i < r; i++ )
        {
            for ( int j = 0; j < c; j++ )
            {
                double zUnit = m.getItem(i,j) == 0 ? (h - x*Math.sin(Math.PI/6)*(2+i+j) < 0.0001 ? 0 : Double.MAX_VALUE) : 
                        (h - x*Math.sin(Math.PI/6)*(2+i+j) ) / m.getItem(i, j);
                minZUnit = Math.min( minZUnit, zUnit );
            }
        }
        
        //minZUnit = 0;
        g.setColor( Color.BLACK );
        for ( int i = r-1; i >= 0; i-- )
        {
            for ( int j = c-1; j >= 0; j-- )
            {
                Color barColor = getColor( m.getItem(i,j) );
                double Fx = (xf + x*Math.cos(Math.PI/6)*(i-j));
                double Rx = Fx + x*Math.cos(Math.PI/6);
                double Lx = Fx - x*Math.cos(Math.PI/6);
                
                double BFy = (h - x*Math.sin(Math.PI/6)*(i+j) );
                double BMy = BFy - x*Math.sin(Math.PI/6);
                
                double TFy = BFy - m.getItem(i, j)*minZUnit;
                double TMy = TFy - x*Math.sin(Math.PI/6);
                double TBy = TMy - x*Math.sin(Math.PI/6);
                
                int [] xs = new int[4];
                int [] ys = new int[4];
                
                xs[0] = (int)Fx;        ys[0] = (int)BFy;
                xs[1] = (int)Rx;        ys[1] = (int)BMy;
                xs[2] = (int)Rx;        ys[2] = (int)TMy;
                xs[3] = (int)Fx;        ys[3] = (int)TFy;
                
                g.setColor( colors[m.getItem(i,j)%colors.length] );
                g.setColor( barColor );
                g.fillPolygon( xs, ys, 4 );
                g.setColor( Color.BLACK );
                g.drawPolygon( xs, ys, 4);
                
                xs[0] = (int)Fx;        ys[0] = (int)BFy;
                xs[1] = (int)Fx;        ys[1] = (int)TFy;
                xs[2] = (int)Lx;        ys[2] = (int)TMy;
                xs[3] = (int)Lx;        ys[3] = (int)BMy;
                
                g.setColor( barColor );
                g.fillPolygon( xs, ys, 4 );
                g.setColor( Color.BLACK );
                g.drawPolygon( xs, ys, 4);
                
                xs[0] = (int)Fx;        ys[0] = (int)TFy;
                xs[1] = (int)Rx;        ys[1] = (int)TMy;
                xs[2] = (int)Fx;        ys[2] = (int)TBy;
                xs[3] = (int)Lx;        ys[3] = (int)TMy;
                
                g.setColor( barColor );
                g.fillPolygon( xs, ys, 4 );
                g.setColor( Color.BLACK );
                g.drawPolygon( xs, ys, 4);
                
                
                gr.clearRect( 0, 0, (int)topW, (int)topH);
                GraphicsUtilityFunctions.drawStringWithFontInRectangle(gr, "" + m.getItem(i,j), f, 0, 0, (int)topW, (int)topH );
                
                
                g2D.drawImage( top, new AffineTransformOp(s, AffineTransformOp.TYPE_NEAREST_NEIGHBOR), (int)Lx, (int)TMy );
                        
            }
        }   
    }
}
