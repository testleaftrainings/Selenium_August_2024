package week1.day2;

public class LearnForLoop {

	
	public static void main(String[] args) {
		
		//syntax: for(initalization(begining of the loop); condition for loop to stop; condition after the loop){}    
		
		int x = 5;
		System.out.println(x);
		x = x +10;
		System.out.println(x);
		System.out.println(x++); // x = 15+ 1 --> x= 16 ,postCondition--> the chances will reflect in next line
		System.out.println(x); // x = 16
		System.out.println(++x);// x = 16+1 --> x =17, preCondition --> the chances will happen in same line
		// type for and press ctrl + spacebar and clcik on the second option
		for (int i = 0; i < 10; i++) {
			System.out.println("Welcome To TestLeaf");
		}
		
		System.out.println("--------------Print numbers from 1 to 10------------");
		for (int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("--------------Print numbers from 10 to 1------------");
		
		for (int i = 10; i>0; i--) {
			System.out.println(i);
		}
		
		// I want to print even number from 1 to 10
		
		// print from 1 to 10
		for (int i = 1; i <=10; i++) {
			if(i%2==0) {
				System.out.println("The number "+i+" is even number");
			}else {
				System.out.println("The number "+i+" is odd number");
			}
		}
		
	}
	
	
	
}
