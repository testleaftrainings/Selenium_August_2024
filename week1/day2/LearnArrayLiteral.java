package week1.day2;

import java.util.Arrays;

public class LearnArrayLiteral {

	
	public static void main(String[] args) {
		// datatype []--> represent array variableName = {value with ,(comma) separation }
		long[] phno = {8925411174L,8925411175L, 8925411171L,8925411173L,8925411180L,8925411172L, 9876543210L};
		System.out.println(phno);// When array variable is printed , it will print the memory location
		
		// Get a particular value from an array by using index
		// Index of the Array starts from zero
		// To get particular value from an array --> varibale[index]
		System.out.println(phno[0]);
		System.out.println(phno[4]);
		System.out.println(phno[5]);
		phno[5] = 8925411170L;
		System.out.println(phno[5]);
		//Get the lenght of an Array
		int length = phno.length;
		System.out.println(length);
		
		for(int i=0;i<length;i++) {
			System.out.println(phno[i]);
		}
		
		// To sort values present in array , Arrays.sort(arrayVariable);
		Arrays.sort(phno);
		System.out.println("-----------After Sort----------");
		for(int i=0;i<length;i++) {
			System.out.println(phno[i]);
		}
	}
	
}
