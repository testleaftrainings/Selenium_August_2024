package week3.day1;

public class NS160 extends Bajaj{

	boolean isEletric = false;
	
	
	public static void main(String[] args) {
		NS160 ns160 = new NS160();
		ns160.startBike();
		ns160.soundHorn();
		ns160.engineCapacity(160);
		System.out.println(ns160.isEletric);
	}
	
}
