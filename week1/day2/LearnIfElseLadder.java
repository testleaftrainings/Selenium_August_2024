package week1.day2;

public class LearnIfElseLadder {

	public static void main(String[] args) {
		
		/*
		 * scenario a kid score marks more than 90 will get a play station kid score
		 * marks more than 70 will get a toy kid score marks more than 50 will get a ice
		 * cream
		 */
		  
		
		int score = 45;
		
		if(score > 90) { // 95> 90
			System.out.println("Play station");
		}else if(score > 70) { // 45>70
			System.out.println("Toys");
		}else if(score > 50) { //45 > 50
			System.out.println("Ice cream");
		}else {
			System.out.println(":(");
		}
		
		// if --> check for only one condition
		// if else --> check for is or that
		// if else ladder --> check for multiple condition
		
	}
	
}
