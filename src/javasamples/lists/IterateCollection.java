package javasamples.lists;

import java.util.*;

public class IterateCollection {
	public static void main (String args[]) {
	    boolean b;
	    String elements[] = {"Blue", "Grey", "Teal"};
	    Set s = new HashSet(Arrays.asList(elements));
	    Iterator i = s.iterator();
	    if (b = i.hasNext()){
	      System.out.println(b);
	      }
	      }

}
