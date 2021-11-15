package javasamples.lists.TreeDArray;

import javasamples.exceptionsample.bankacc.InsufficientFundsException;

public class arr1D {

	Element elm[];
	int dim1;
	public arr1D(int n) {
		elm=new Element[n];
		dim1 = n;
	}
	public void setElement(int n,Element e)throws ArrayException{
		if(n > dim1) 
			throw new ArrayException("this dim1 is not valid");
		elm[n]=e;
	}
	
	public Element getElement(int n) throws ArrayException {
		if(n > dim1) 
			throw new ArrayException("this dim1 is not valid");
	
		return elm[n];
	}
	
}
