package week1.day2;

public class PrintCommonNumbers {

	
	public static void main(String[] args) {
		
		int[] num1 = {1,2,5,7,8,9};
		int[] num2 = {3,4,5,7,1,0, 10,13};
		
		//iterate the num1 (outer for loop)
		for (int i = 0; i < num1.length; i++) {
			//iterate the num2 (inner for loop)
			for (int j = 0; j < num2.length; j++) {
				
				//check the num1[i]==num2[j]
				if(num1[i]==num2[j]) {
					System.out.println(num1[i]);
					break;
				}
				
			}
			
		}
		
	}
	
}
