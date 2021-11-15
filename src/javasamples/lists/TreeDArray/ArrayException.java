package javasamples.lists.TreeDArray;

public class ArrayException extends Exception{
	   private String msg;
	   public ArrayException(String m)
	   {
	      this.msg = m;
	   } 
	   public String getMsg()
	   {
	      return msg;
	   }
}
