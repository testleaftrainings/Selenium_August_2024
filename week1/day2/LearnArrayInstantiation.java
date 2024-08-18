package week1.day2;

public class LearnArrayInstantiation {

	
	public static void main(String[] args) {
		
		// datatype[] variableName = new dataType[size];
		int[] num = new int[5];
		System.out.println(num.length);
		// default values --> byte, short, int, long - 0
						 //--> float , double --> 0.0
						// boolean --> false
						// String --> null , char - 0 or null
		long[] phno = new long[5];
		System.out.println(phno[0]);
		
		num[0] = 1;
		num[1] = 5;
		num[2] = 7;
		num[3] = 4;
		num[4] = 2;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
	
}
