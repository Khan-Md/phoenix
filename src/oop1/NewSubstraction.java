package oop1;

public class NewSubstraction  extends NewAddition{
	
	String name="Substraction";
	
	
	
	// Method One
	
	void sub(int a, int b) {
		
		int s;
		if( a>b)
			s=a-b; 
		else s=b-a;
		
		System.out.println(s);
		
	}
	
	
	// Method Two 
	
	
	void sub(double a, double b) {
		
		double s =a-b;
		
		System.out.println(s);
	
		
		
	}
	
	
	  // Here run time Polymorphism is done here as we call method three from newAddition class

		
	// Method three 
	
	
	void add(int a, int b) {

			int sum = a + b+100;
			System.out.println(sum);

		}
	

	
	
	// Main Method 
	public static void main(String[] args) {

		NewSubstraction ns1=new NewSubstraction();
		ns1.sub(25, 45);
		ns1.add(15, 15);
	   
		

	} // End of main Method
	
	

} // End of class
