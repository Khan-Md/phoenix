package oop1;

public class Subtraction extends Addition {
	
	int x;
	int y;
	
	// Method 1
	
	void sub() {
		int s=x-y;
		System.out.println(s);
		
	}
	
	 // Method 2
	
	int sub(int a, int b) {
	
	int s;
	
	if (a>b)
		s=a-b;
	
	else 
		s=b-a;
	
	return s;
			
	}
	
	
	
	// Method 3 
	
	
	int add(int a, int b, int c) {
		int sum = a+b+c+5;
		return sum;
		
	}
	
	

	

	public static void main(String[] args) {
	
		Subtraction s1= new Subtraction();
		s1.sub();
		
		int sum1= s1.sub(200,100);
		System.out.println(sum1);
		
		int sum=s1.add(500, 500, 500);
		
		System.out.println(sum);
			

	} // End of Main
	
	

} // End of Class
