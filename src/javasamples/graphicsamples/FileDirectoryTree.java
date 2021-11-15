package javasamples.graphicsamples;

import javax.swing.*;
import javax.swing.event.*;
import java.util.Properties;
import javax.swing.JTree.*;

public class FileDirectoryTree{
  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
      JFrame fm = new JFrame("System file properties of tree ");
      Properties p = System.getProperties();
      JTree tree = new JTree(p);
      tree.setRootVisible(true);
      JScrollPane scrollpane = new JScrollPane(tree);
      fm.getContentPane().add(scrollpane, "Center");
      fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      fm.setSize(450,400);
      fm.setVisible(true);
    }
    catch (Exception e) {}
  }
} 