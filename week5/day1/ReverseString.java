package week5.day1;

public class ReverseString {

	public static void main(String[] args) {
		
		String text = "Welcome to TestLeaf";
		//faeLtseT ot emocleW
		String output ="";
		//Convert the String into Array
		char[] charArray = text.toCharArray();
		System.out.println(charArray[text.length()-1]);
		//Iterate the array in reverse order
		for(int i=text.length()-1; i>=0; i--) {
//			System.out.print(charArray[i]);
			output = output + charArray[i];
		}
		System.out.println(output);
	}

}
