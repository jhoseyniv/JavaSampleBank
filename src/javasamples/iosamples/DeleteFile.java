package javasamples.iosamples;



import java.io.*;
  
public class DeleteFile{
  
  private static void deletefile(String file){
  
    File f1 = new File(file);
 
   boolean success = f1.delete();

      if (!success){
  
    System.out.println("Deletion failed.");
 
     System.exit(0);
   }
else{
System.out.println("File deleted.");
}
 }
  
  public static void main(String[] args){
  
    switch(args.length){
  
      case 0: System.out.println("File has not mentioned.");
  
          System.exit(0);
  
      case 1: deletefile(args[0]);
 
         System.exit(0);
  
    default : System.out.println("Multiple files are not allow.");
  
            System.exit(0);
   
 }
  
}
  
} 