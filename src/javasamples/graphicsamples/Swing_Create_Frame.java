package javasamples.graphicsamples;

import javax.swing.*;

public class Swing_Create_Frame{
  public static void main(String[] args){ 
    JFrame frame = new JFrame("Frame in Java Swing");
    frame.setSize(400, 400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
} 