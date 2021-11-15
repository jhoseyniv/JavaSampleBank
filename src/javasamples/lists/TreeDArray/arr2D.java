package javasamples.lists.TreeDArray;

public class arr2D {
	arr1D elm[];
	int dim2;
	public arr2D(int m , int n) {
		elm = new arr1D[m];
		dim2=m;
		for(int i=0;i<m;i++) 
			elm[i]=new arr1D(n);
	}
	public void setElement(int m,int n,Element e)throws ArrayException{
		if(m > dim2) 
			throw new ArrayException("this dim2 is not valid");
		arr1D a=elm[m];
		a.setElement(n, e);
	}
	public Element getElement(int m , int n) throws ArrayException{
		if(m > dim2) throw new ArrayException("this dim2 is not valid");
		arr1D  e=elm[m];
		return e.getElement(n);
	}
	
}
