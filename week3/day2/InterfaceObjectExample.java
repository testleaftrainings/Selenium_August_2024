package week3.day2;

public class InterfaceObjectExample {

	
	public static void main(String[] args) {
//		MobileFeatures mf = new MobileFeatures();--> not possible to create object for interface
		//But with the help of implementation class possible
		
		MobileFeatures mf = new Appleuser();
		mf.sendMsg();
		mf.simCard();
		mf.makeCall();
		
		
	}
	
	
}
