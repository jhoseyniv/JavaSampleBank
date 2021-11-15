package javasamples.iosamples;



//the instance of the File class gives you size of the file.

//Here is the code of the program : 

import java.io.*;


  public class FileSize{
  

 public static void main(String[] args) throws IOException{
 
   System.out.print("Enter file name : ");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    File f = new File(in.readLine());
  
  if(f.exists()){
   
   long file_size = f.length();
  
      System.out.println("Size of the file : " + file_size);
 
   }
    
else{
   
   System.out.println("File does not exists.");
 
     System.exit(0);
   
 }
 
 }
  
} 
 
