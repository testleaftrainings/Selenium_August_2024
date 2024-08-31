package week3.day1;

public class Safari extends Browser{

	public void readerMode() {
		System.out.println("Set the window to readerMode");
	}
	
	public void fullScreenMode() {
		System.out.println("Set the window to fullScreen mode");
	}
	
	public static void main(String[] args) {
		
		Safari s = new Safari();
		s.openUrl();
		s.navigateBack();
		s.fullScreenMode();
		s.readerMode();
		s.closeBrowser();
		s.browserName ="Safari";
		s.browserName = "76.34";
		
	}
	
}
