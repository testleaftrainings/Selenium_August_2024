package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		 int[] num={2, 5, 7, 7, 5,8, 9, 2, 3,8};
		 
		 //Option 1: using nested for loop
		 for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]);
				}
			}
		}
		
		 //option 2: using single for loop
		 Arrays.sort(num);
		 //{2,2,3,5,5,7,7,9};
		 for (int i = 0; i < num.length-1; i++) {
			if(num[i]==num[i+1]) {
				System.out.println(num[i]);
			}
		}
		 
		 

	}

}
