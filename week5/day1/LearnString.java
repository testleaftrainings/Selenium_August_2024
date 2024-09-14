package week5.day1;

public class LearnString {

	
	public static void main(String[] args) {
		
		String text = "Hello World";
		
		System.out.println(text.charAt(10));
		
		char[] charArray = text.toCharArray();
		for (char c : charArray) {
			System.out.println(c);
		}
		
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		System.out.println(text);
		String concat = text.concat(" and Welcome to TestLeaf");
		System.out.println(concat);
		System.out.println(text);
		
		String replace = text.replace('H', 'h');
		System.out.println(replace);
		String replace2 = text.replace("World", "TestLeaf");
		System.out.println(replace2);
		
		System.out.println(text.replace("l", "Ll"));
		
		String password = "Leaf$7321"; 
		String replaceFirst = password.replaceFirst("[^1-5]", "K");
		System.out.println(replaceFirst);
		
		String leadId ="TestLeaf (14363)";
		//To get only numbers
		String leadNumber = leadId.replaceAll("[^0-9]", "");
		System.out.println("leadNumber "+leadNumber);
		
		String charSeq = leadId.replaceAll("[0-9]", "");
		System.out.println("charSeq "+charSeq);
		String charS = leadId.replaceAll("[^a-zA-Z]", "");
		System.out.println("charS "+charS);
		
		
		
	}
	
}
