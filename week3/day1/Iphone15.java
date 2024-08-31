package week3.day1;

public class Iphone15 {

	
	String chargingPort = "Type - C";
	boolean isWirelessCharge = true;
	
	public void accessNotification() {	
		System.out.println("Access notification via Dynamic island");
	}
	
	
	public void makeCall() {
		System.out.println("Hey siri, Make make call to ........");
	}
	
	public void sendMsg() {
		System.out.println("Hey siri, Send a message to ........");
	}
	
	
	public static void main(String[] args) {
		Iphone15 i15 = new Iphone15();
		i15.accessNotification();
		i15.sendMsg();
		i15.makeCall();
		System.out.println(i15.chargingPort);
		System.out.println(i15.isWirelessCharge);
	}
	
	
	
}
