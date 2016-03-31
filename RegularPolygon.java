//*******************************************************************
// Java compiler created in PHP to quickly and safely test code.
// NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************

import java.lang.Math; // header stuff MUST go above the first class
import java.awt.*;

// our main class becomes a file but the main method is still found
public class RegularPolygon
{
  public static void main(String[] args)
  {
    
    regPoly(150,150,50,5);
    
  }
  
  public void paint(Graphics g)
  {
   
    g.fillPolygon(regPoly(150,150,50,5));
    
  }
  
  
  public static Polygon regPoly( int centerX , int centerY , int spokeLength , int numSides )
  {

  	double theta = (double)(((numSides - 2) * 180) / numSides);

    int[] polyX = new int[ numSides ];
    int[] polyY = new int[ numSides ];

   	for ( int i = 0 ; i < numSides ; i++ )
    {

    	polyY[ i ] = (int) ( spokeLength * Math.sin( Math.toRadians( theta ) ) + centerY );

        polyX[ i ] = (int) ( spokeLength * Math.cos( Math.toRadians( theta ) ) + centerX );
      

        theta += (double)(((numSides - 2) * 180) / numSides);

    }
    
    for( int k = 0 ; k < polyX.length ; k++ )
    {
      
      System.out.println("Point " + (k + 1));
      System.out.println("x-coord " + (k + 1) + ": " + polyX[k]);
      System.out.println("y-coord " + (k + 1) + ": " + polyY[k]);
      System.out.println("---------------------------------");
      
    }
    
    return new Polygon(polyX,polyY,numSides);
    
  }
  
}
