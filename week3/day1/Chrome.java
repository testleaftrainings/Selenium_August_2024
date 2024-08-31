package week3.day1;

public class Chrome extends Browser {

	
	public void openIncognito()
	{
		System.out.println("Open a new window in incognito");
	}
	
	public void clearCache() {
		System.out.println("Clear browser cache");
	}
	
	
	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.browserName = "Chrome";
		c.browserVersion = "127.235.24";
		c.openUrl();
		c.navigateBack();
		c.clearCache();
		c.openIncognito();
		c.closeBrowser();
	}
}
