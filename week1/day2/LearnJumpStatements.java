package week1.day2;

public class LearnJumpStatements {

	public static void main(String[] args) {
		
		// print the numbers from 1 to 10 and skip multiple of 3
		
		for (int i = 1; i <11; i++) {
			//check the number multiple of 3
			// 1 2 4 5 7 8 10
			if(i%3==0) {
				continue; // it will skip the current iteration
			}
			
			System.out.println(i);
		}
		
		
		for (int i = 0; i <10 ; i++) {
			if(i==5) {
				break;// it will stop the entire iteration
			}
			
			System.out.println(i);
		}
		
		
		for(int i=0; i<1; ++i) {
			System.out.println(i);
		}
	}
	
	
}
