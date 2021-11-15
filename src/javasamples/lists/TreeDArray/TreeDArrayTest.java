package javasamples.lists.TreeDArray;

public class TreeDArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dim1=130;
		int dim2=130;
		int dim3=130;
		Element e;
		arr3D my3DimensionArray=new arr3D(dim3,dim2,dim1);
		for(int n=0;n<dim1;n++){
			for(int m=0;m<dim2;m++){
				for(int k=0;k<dim3;k++){
					e=new Element(2,2);
					try {
						my3DimensionArray.setElement(k,m, n, e);
					} catch (ArrayException e1) {
						System.out.println(e1.getMessage());
					}
				}
			}
		}
		//print array elements
		long count=0;
		for(int n=0;n<dim1;n++){
			for(int m=0;m<dim2;m++){
				for(int k=0;k<dim3;k++){
					try {
						e=my3DimensionArray.getElement(k,m, n);
						count++;
						System.out.println(count+") Element("+k+","+n+","+m+")=("+e.getA()+","+e.getB()+")");
					} catch (ArrayException e1) {
						System.out.println(e1.getMessage());
					}
				}
			}
		}
			
	}
}