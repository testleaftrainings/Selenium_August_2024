package week3.day1;
// Bajaj is subClass and Bike is superClass
public class Bajaj extends Bike{

	
	public void engineCapacity(int cc) {
		System.out.println(cc+"cc Engine");
	}
	
	
	public void discQuantity(int discNos) {
		System.out.println("Disc quantity "+ discNos);
	}
	
	public static void main(String[] args) {
		
		Bajaj b  = new Bajaj();
		b.startBike();
		b.soundHorn();
		b.applyBrake();
		b.engineCapacity(150);
		b.discQuantity(0);
//		System.out.println(b.isWorking);
		
	}
	
}
