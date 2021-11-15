package javasamples.graphicsamples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class SwingDemo extends JFrame{
  JLabel msgLabel;
  
  public SwingDemo(){
    super("Swing");
    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e){
        System.exit(0);
        }
        });
        
        ActionListener al = new ActionListener(){
          public void actionPerformed(ActionEvent ae){
            msgLabel.setText(((JButton)ae.getSource()).getText());
            }
            };
            
            JButton button;
            JPanel buttonPanel = new JPanel();
            buttonPanel.setBorder(new TitledBorder("Click a button"));
            for (int i = 0; i < 3; i++){
              button = new JButton("Button " + (i + 1));
              button.addActionListener(al);
              buttonPanel.add(button);
              }
              
              JPanel p = new JPanel(new BorderLayout());
              p.setBorder(new EmptyBorder(8, 8, 8, 8));
              msgLabel = new JLabel("No button pressed!");
              p.add(msgLabel, BorderLayout.NORTH);
              p.add(buttonPanel, BorderLayout.CENTER);
              setContentPane(p);
              pack();
              setVisible(true);
  }
  
  public static void main(String[] args){
    new SwingDemo();
    }
} 