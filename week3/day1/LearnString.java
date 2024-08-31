package week3.day1;

public class LearnString {

	
	public static void main(String[] args) {
		
		
		String name1 = "TestLeaf";
		String name2 = "Testleaf";
		String name3 = new String("TestLeaf");
		String name4 = new String("TestLeaf");
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		
		System.out.println(name1==name2);
		System.out.println(name3==name4);
		System.out.println(name2==name3);
		
		//To get the length of the String
		System.out.println(name1.length());
		//To compare values in string use String methods
		//equals() --> compare the exact text with exact case
		System.out.println("Name1 and name 4 is same "+name1.equals(name4));
		System.out.println("name1 and name2 is same "+name1.equals(name2));
		
		//equalsIgnoreCase() --> compare the exact text but ignore the case
		System.out.println("name1 and name2 is same without case sensitive "+name1.equalsIgnoreCase(name2));
		
		//contains() --> check for the partial sequence of character with exact case
		System.out.println("check test is available in name1 "+name1.contains("test"));
		System.out.println("Check Leaf is available in name1 "+name1.contains("Leaf"));
		
		
	}
	
	
}
