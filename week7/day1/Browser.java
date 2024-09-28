package week7.day1;

public class Browser extends BrowserCapabilities{
		
	static int browserVersion =  126;// static varibale/ class variable
	final String browserName = "Chrome";
	
	public Browser() {
		System.out.println("Constructor from Browser class");
	}
	
	
	/**
	 * static methods allow to access only the static member(variables/methods), 
	 * But non-static methods allow to access both static and non-static members
	 * */
	
	
	/**
	 * this keyword is to access the same class variable/ methods/constructor 
	 * but inside the static member/method this keyword will not work.
	 * this keyword helps to resolve the ambiguity of globalVariable and parameterizedVaraible 
	 * */
	
	/**
	 * final is constant once the variable is declared as final it not allow us to update the value for the variable
	 * If it is method it not allow us to override the method
	 * If it is class it not allow 
	 * */
	
	public void updateBrowser(int browserVersion) {
//		browserName = "Safari";
		super.updateBrowser(browserVersion);
		this.browserVersion++;
	}
	
	public void reload() {
		System.out.println("super class browser name is "+super.browserName);
		System.out.println("sub class browser name is "+this.browserName);
		this.updateBrowser(browserVersion);
		this.clearCookies();
	}
	
	public static void clearCookies() {
		
		System.out.println("Clear the Browser cookies");
	}
	
	public static void main(String[] args) {
		
		Browser user1 = new Browser();
		System.out.println("---------------user1-----------------");
		System.out.println(user1.browserName);
		user1.clearCookies();
		user1.updateBrowser(browserVersion);
		System.out.println(user1.browserVersion);
		
		System.out.println("---------------user2-----------------");
		
		Browser user2 = new Browser();
		System.out.println(user2.browserName);
		user2.clearCookies();
		user2.updateBrowser(browserVersion);
		System.out.println(user2.browserVersion);
		user2.reload();
		
		
		
	}
	
	
	//static block
	static {
		System.out.println("This is static block");
	}
	
	
	//non static block
	{
		System.out.println("This is non static block");
	}
	

}
