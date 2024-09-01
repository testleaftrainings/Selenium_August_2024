package week3.day2;

public interface MobileFeatures {

	public void makeCall();
	
	
	public void sendMsg();
	
	default void simCard() {
		System.out.println("Atleast 1 sim is mandatory");
	}
	
	
}
