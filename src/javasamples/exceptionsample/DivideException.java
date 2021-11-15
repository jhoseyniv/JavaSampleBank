package javasamples.exceptionsample;

public class DivideException {

    public static void main(String[] args) {
    	division(100,4);		// Line 1
    	division(100,0);        // Line 2    
        System.out.println("Exit main().");                   
    }

    public static void division(int totalSum, int totalNumber) {
    	System.out.println("Computing Division.");  
    	int average  = totalSum/totalNumber; 
        System.out.println("Average : "+ average);
    }
}
