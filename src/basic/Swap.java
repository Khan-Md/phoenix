package basic;

public class Swap {

	public static void main(String[] args) {
		int x = 15;
		int y = 10;
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("New value for x :" + x);
		System.out.println("New value for y :" + y);

	} // End of main

} // End of class
