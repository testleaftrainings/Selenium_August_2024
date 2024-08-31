package week3.day1;

public class Calculator {

	public void add(int a, int b) {
		System.out.println("The addition of "+a+" and "+b+" is "+(a+b));
	}
	
	public void add(float a, int b, int c ) {
		System.out.println("The addition of "+a+" and "+b+" is "+(a+b) +" is decimal");
	}
	
	
	
	public void add(int a, int b , int c, int d) {
		System.out.println(a+b+c+d);
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	private void sub(float x, int y) {
		System.out.println(x-y);
	}
	
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(1,2);
		cal.add(1,5,7);
		cal.add(2,6,7,10);
		cal.sub(5.5f, 10);
		int  output = cal.sub(5, 10);
		System.out.println(output);
		
	}

}
