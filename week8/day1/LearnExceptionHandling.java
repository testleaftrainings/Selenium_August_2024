package week8.day1;

public class LearnExceptionHandling {

	public static void main(String[] args) throws Exception {
		int[] num = {10,1,2,3,4,5};
		try {
			System.out.println(num[6]);
			System.out.println(num[1]/num[0]);//1/0
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This is from catch block");
			System.out.println(num[num.length-1]);
		}catch(ArithmeticException e) {
			System.out.println("second catch block");
			System.out.println(num[2]/num[1]);
		}finally {
			System.out.println("This is finally block for multi try catch");
		}
		
		try {
			System.out.println("Start DB");
			try {
				System.out.println(1/0);
			} catch (Exception e) {
				System.out.println("Hello");
				String x = "Welcome123";
				try {
					int int1 = Integer.parseInt(x);
					System.out.println(int1);
				} catch (NumberFormatException e1) {
					String replaceAll = x.replaceAll("[^0-9]", "");
					int int1 = Integer.parseInt(replaceAll);
					System.out.println(int1);
				}
			}
			
		System.out.println("After the nested try catch block");
		if(num[0]==0) {
			throw new ArithmeticException("The num of index zero is 0");
		}
		}finally {
			System.out.println("Close the DB");
		}
		
		
		
	}

}
