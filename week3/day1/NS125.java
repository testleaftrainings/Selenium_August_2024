package week3.day1;
// NS125 is subclass and Bajaj is superClass
public class NS125 extends NS200 {

	boolean isWorking = true;
	String displayType = "Digital";
	
	public static void main(String[] args) {
		NS125 ns125 = new NS125();
		ns125.applyBrake();
		ns125.startBike();
		ns125.soundHorn();
		ns125.discQuantity(1);
		ns125.engineCapacity(125);
		System.out.println(ns125.displayType);
		System.out.println(ns125.isWorking);
	}
	
	
}
