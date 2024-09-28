package week7.day1;

public class LearnConstructor extends Browser{
	
	int x;
	
	LearnConstructor() {
		super();
		System.out.println("This is default constructor or No argument constructor");
	}
	
	public LearnConstructor(int x) {
		this();
		this.x = x;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main method starts");
//		LearnConstructor lc = new LearnConstructor(7);		
//		System.out.println(lc.x);
	}
	
	
}
