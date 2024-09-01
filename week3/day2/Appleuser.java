package week3.day2;

public class Appleuser  extends Iphone13 {

	@Override
	public void iosVersion() {
		System.out.println("IOS  version 17.4.6");
	}

	
	public static void main(String[] args) {
		
		Appleuser user1 = new Appleuser();
		user1.batteryCapacity();
		user1.cameraDetails();
		user1.makeCall();
		user1.sendMsg();
		user1.iosVersion();
		
		
	}
	
	
	
}
