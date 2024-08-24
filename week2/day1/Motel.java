package week2.day1;

public class Motel {

	
	//  to create a method name --> type methodname and do ctrl + spacebar and enter
	
	public int dosa(int quanity) {
		int dosaPrice = 40;
		int amount = quanity * dosaPrice;
		System.out.println("The quantity is "+quanity);
		return amount;
	}
	
	
	public String idly() {
		
		return "Idly not available";
	}
	
	
	
	public static void main(String[] args) {
		
		Motel p1 = new Motel();
		int amount = p1.dosa(5);  //to the value into variable - press a ctrl +2 and release both keys and press a key L(lowecase)
		System.out.println(amount);
		Motel p2 = new Motel();
		System.out.println(p2.dosa(2));
		p1.dosa(0);
		String idly = p1.idly();
//		System.out.println(idly);
	}
	
	
	
}
