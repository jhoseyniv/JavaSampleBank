package javasamples.iosamples;



import java.io.*;
//Lets see an example that checks the existence of  a specified file.


public class CreateFile1{
    public static void main(String[] args) throws IOException{
      File f;
      f=new File("myfile.txt");
      if(!f.exists()){
      f.createNewFile();
      System.out.println("New file \"myfile.txt\" has been created to the current directory");
      }
    }
} 