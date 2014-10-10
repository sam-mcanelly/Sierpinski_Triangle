

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Sam McAnelly
 * CWID: 11533007
 */
public class SierpinskiPanel extends JPanel {
    
    private int initialSide = 0;
    
    @Override
    public void paintComponent(Graphics g) {
        if (getWidth() > getHeight())
            initialSide = getHeight();
        else
            initialSide = getWidth();
        paintPixel(0, 0, initialSide, g);
       
    }
    
    public void paintPixel(int x, int y, int side, Graphics g) {
        if (side <= 1)
            g.fillRect(x, y, side, side);
        else {
            //Lower Left
            paintPixel(x, y + (side / 2), side / 2, g);
            
            //Lower Right
            paintPixel(x + (side / 2), y + (side / 2), side / 2, g);
            
            //Upper
            paintPixel(x + (side / 4), y, side / 2, g);
            
        }
    }
    
}
