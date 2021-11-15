package javasamples.graphicsamples;

import javax.swing.*;
import java.awt.*;

public class CreateToolbar{
  public static void main(String[] args) {
    JFrame frame = new JFrame("Create a toolbar Which have three buttons Such as: Cut, Copy, Paste");
    JToolBar toolbar = new JToolBar("Toolbar", JToolBar.HORIZONTAL);
    JButton cutbutton = new JButton(new ImageIcon("images/cut.jpg"));
    toolbar.add(cutbutton);
    JButton copybutton = new JButton(new ImageIcon("images/copy.jpg"));
    toolbar.add(copybutton);
    JButton pastebutton = new JButton(new ImageIcon("images/paste.jpg"));
    toolbar.add(pastebutton);
    frame.getContentPane().add(toolbar,BorderLayout.NORTH);
    frame.setUndecorated(true);
    frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,400);
    frame.setVisible(true);
  }
} 