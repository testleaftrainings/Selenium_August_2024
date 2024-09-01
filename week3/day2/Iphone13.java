package week3.day2;

public abstract  class Iphone13 implements IphoneDesign, MobileFeatures{

	public void makeCall() {
		System.out.println("Make a call");		
	}

	public void sendMsg() {
		System.out.println("Send a message ");
	}

	public void screenSize() {
		System.out.println("5.5 inch Screen size");
	}

	public void batteryCapacity() {
		System.out.println("3498 Mah battery capacity");
	}

	public void chargingPort() {
		System.out.println("Charging port is lighting port");
	}

	public void cameraDetails() {
		System.out.println("Front camera is 12MP and Back Camera is 12MP+12 MP");
	}
	
	
	//implemented method
	public void wirelessCharge() {
		System.out.println("Support wireless charging");
	}
	
	//unimplemented method
	public abstract void iosVersion();

}
