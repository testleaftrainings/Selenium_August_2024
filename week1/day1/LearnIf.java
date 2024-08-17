package week1.day1;

public class LearnIf {

	
	
	public static void main(String[] args) {
		
		System.out.println(1+1);
		System.out.println(11/2); 
		System.out.println(11%2); // remainder
		int a = 2;
		int b = 3;
		if(a<b) {
			System.out.println("If condition is satisfied");
		}else {
			System.out.println("If condition is not satisfied");
		}
		
		int num = 10;
		
		//Check the number is odd or even
		if(num%2==0) {
			System.out.println("The number "+num+" is even number");
		}else {
			System.out.println("The number "+num+" is odd number");
		}
		
	}
	
}
