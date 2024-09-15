package week5.day2;

public class LearnSwitchCase {

	
	public static void main(String[] args) {
		
		String browser = "chrome";
		switch(browser) {
			
		case "edge":
				System.out.println("Launch Edge browser");
				break;
		
		case "firefox":
				System.out.println("Launch Firefox browser");
				break;
			
		case "chrome":
				System.out.println("Launch Chrome Browser");
				break;
				
		case "safari":
				System.out.println("Launch Safari Browser");
				break;
		default :
			System.out.println("unsupported browser ");
		
		}
	}

	
}
