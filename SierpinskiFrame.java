

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Sam McAnelly
 * CWID: 11533007
 */
public class SierpinskiFrame extends JFrame {
    public SierpinskiFrame(String title){
        this.setTitle(title);
        Toolkit kit = Toolkit.getDefaultToolkit();
        this.setSize(kit.getScreenSize());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new SierpinskiPanel());
    }
}
