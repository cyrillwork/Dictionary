/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.awt.BorderLayout;
import javax.swing.JFrame;
/**
 *
 * @author Admin
 */
public class Dictionary
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Dictionary");
        frame.getContentPane().add(BorderLayout.CENTER, new DictPanel());
        frame.setSize(250, 150);
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
