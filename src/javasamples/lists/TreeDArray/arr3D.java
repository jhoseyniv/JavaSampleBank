package javasamples.lists.TreeDArray;

public class arr3D {

	arr2D elm[];
	int dim3;
	public arr3D(int k, int m , int n) {
		elm=new arr2D[k];
		dim3=k;
		for(int i=0;i<k;i++)
			elm[i]=new arr2D(m,n);
	}
	public void setElement(int k,int m,int n,Element e)throws ArrayException{
		if(k > dim3) 
			throw new ArrayException("this dim3 is not valid");
	 arr2D a=elm[k];
	 a.setElement(m,n, e);
	}

	public Element getElement(int k ,int m , int n) throws ArrayException{
		if(k > dim3) throw new ArrayException("this dim3 is not valid");
		arr2D  e=elm[k];
		return e.getElement(m,n);
	}
	
}
