package javasamples.designpattern.factory;

public class SalutationFactory { 
	  public static void main(String args[]) {
		  SalutationFactory factory = new SalutationFactory();
		  factory.getPerson("Ali rezai", "M");
		  factory.getPerson("mina asadi", "F");
		  factory.getPerson("Ali rezai", "M");
	  } 
	  
	public Person getPerson(String name, String gender) {
		if (gender.equals("M"))
			return new Male(name);
		else if(gender.equals("F"))
			return new Female(name);
		else
			return null;
	}

	 
	}// End of class 
