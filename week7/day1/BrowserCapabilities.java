package week7.day1;

public  class BrowserCapabilities {

	public BrowserCapabilities() {
		System.out.println("Constructor from BrowserCapabiities Class");
	}
	
	String browserName ;
	
	public void incognitoBrowser() {
		System.out.println("Browser the browser window in Incognito");
	}
	
	public  void updateBrowser(int browserVersion) {
		System.out.println("This is from super class "+browserName);
	}
	
	
}
