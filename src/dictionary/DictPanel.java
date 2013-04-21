/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class DictPanel extends JPanel
{
    public DictPanel()
    {
        this.setLayout(new BorderLayout());

        JPanel n = new JPanel();
        n.add(new JLabel("   "));
        add(BorderLayout.NORTH, n);
        
        
        JTextField text = new JTextField("Text Field");
            
        JPanel c = new JPanel();
        c.add(new JLabel("Word"));
        c.add(text);
        add(BorderLayout.CENTER, c);
        
        text.addKeyListener(new java.awt.event.KeyListener() {

            @Override
            public void keyTyped(KeyEvent e)
            {
                System.out.println("keyTyped");
                //throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                System.out.println("keyPressed");
                //throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void keyReleased(KeyEvent e)
            {
                System.out.println("keyReleased");
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        });
              
        JButton okButton = new JButton("OK");
        JButton clButton = new JButton("Close");
            
        JPanel s = new JPanel();
        s.add(okButton);
        s.add(clButton);
        add(BorderLayout.SOUTH, s);
                
        okButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                System.out.println("OK");
            }
        });

        clButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                System.exit(0);
            }
        });

        

    }
    
}
