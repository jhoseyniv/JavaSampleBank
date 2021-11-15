package javasamples.iosamples;



//Lets see an example to create a file to the specified location.

import java.io.*;

public class PathFile{
    public static void main(String[] args) throws IOException{
      File f;
    f=new File("example" + File.separator + "myfile.txt");
      f.createNewFile();
      System.out.println("New file \"myfile.txt\" has been created to the specified location");
      System.out.println("The absolute path of the file is: "
                +f.getAbsolutePath());      
    }
} 
 
