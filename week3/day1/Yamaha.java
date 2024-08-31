package week3.day1;

public class Yamaha extends Bike{

	boolean isTwoStrokeEngine = true;
	
	
	public static void main(String[] args) {
		
		Yamaha y = new Yamaha();
		System.out.println(y.isTwoStrokeEngine);
		y.startBike();
		y.applyBrake();
		y.soundHorn();
		
	}
	
}
