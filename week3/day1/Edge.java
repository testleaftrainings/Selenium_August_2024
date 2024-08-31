package week3.day1;

public class Edge extends Browser{

	public void takeSnap() {
		System.out.println("Take a snapshop");
	}
	
	public void clearCookies() {
		System.out.println("Clear browser cookies");
	}
	
	public static void main(String[] args) {
		
		Edge e  = new Edge();
		e.openUrl();
		e.navigateBack();
		e.clearCookies();
		e.closeBrowser();
		e.takeSnap();
		e.browserName ="Edge";
		e.browserVersion="125.124.34";
		
	}
	
	
}
