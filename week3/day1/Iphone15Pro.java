package week3.day1;
// subClass extends superClass
public class Iphone15Pro extends Iphone15  {

	
	public void cameraDetails() {
		System.out.println("front camera is 12MP and Back camera is 48 MP + 12 MP + 12 MP");
	}
	
	
	public static void main(String[] args) {
		
		Iphone15Pro i15p = new Iphone15Pro();
		i15p.accessNotification();
//		i15p.makeCall();
		i15p.sendMsg();
		System.out.println(i15p.chargingPort);
		i15p.cameraDetails();
		
		Iphone15 i15 = new Iphone15();
		i15.accessNotification();
		i15.sendMsg();
		i15.makeCall();
		System.out.println(i15.chargingPort);
		System.out.println(i15.isWirelessCharge);
//		i15.cameraDetails();
		// In inheritance subclass can access the properties of superClass,
			//but superClass can't access the properties of subClass
	}
	
	
}
