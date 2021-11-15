package javasamples.iosamples;


//Another program set the dynamic path using File.separator given below:

import java.io.*;

  
public class ConstructingFileNamePath {
  
  public static void main(String[] args){

      String filepath = File.separatorChar + "tapan"+ File.separatorChar + "joshi";

      System.out.println("The path of the file is  :  " + filepath);
  
       }
  
}

 
