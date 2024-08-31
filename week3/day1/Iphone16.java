package week3.day1;

public class Iphone16 extends Iphone15 {

	
	String chargingPort = "No port";
	
	public void makeCall() {
		System.out.println("Make a call through whatsapp");
	}
	
	public void sendMail() {
		
	}
	
	//Main method is static method - can't overrides the static methods
	public static void main(String[] args) {
		
		Iphone16 ip16 = new Iphone16();
		ip16.accessNotification();
		ip16.sendMsg();
		ip16.makeCall();
		System.out.println(ip16.chargingPort);
		System.out.println(ip16.isWirelessCharge);
		
	}
	
	
}
