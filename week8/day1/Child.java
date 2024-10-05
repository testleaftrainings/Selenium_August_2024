package week8.day1;

public class Child extends Parent {

	public void accessCard() {
		setCardPin(7777);
		System.out.println(getCardPin());
	}

	public static void main(String[] args) {
		Child c = new Child();
			c.accessCard();
	}
	
}
