package week3.day1;

public class NS200 extends Bajaj {

	boolean isSupportBluetoothConnectivity = true;
	
	public static void main(String[] args) {
	
		NS200 ns200 = new NS200();
		ns200.applyBrake();
		ns200.discQuantity(2);
		ns200.engineCapacity(200);
		System.out.println(ns200.isSupportBluetoothConnectivity);
		
	}
	
	
	
}
