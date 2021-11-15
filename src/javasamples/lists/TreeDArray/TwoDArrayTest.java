package javasamples.lists.TreeDArray;

public class TwoDArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dim1=3;
		int dim2=3;
		
		arr2D my2DimensionArray=new arr2D(dim2,dim1);
		for(int n=0;n<dim1;n++)
			for(int m=0;m<dim2;m++){
				Element e=new Element(2,2);
				try {
					my2DimensionArray.setElement(m, n, e);
				} catch (ArrayException e1) {
					System.out.println(e1.getMessage());
				}
			}
		
		//print array elements
		for(int n=0;n<dim1;n++)
			for(int m=0;m<dim2;m++){
				Element e=new Element(2,2);
				try {
					e=my2DimensionArray.getElement(m, n);
					System.out.println("Element("+n+","+m+")=("+e.getA()+","+e.getB()+")");
				} catch (ArrayException e1) {
					System.out.println(e1.getMessage());
				}
			}
	
	
	}

}
