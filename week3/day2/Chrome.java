package week3.day2;

//If interface is implemented in the class then the class is implementation class 
public class Chrome implements Browser{

	public void searchEngine() {
		System.out.println("Default search engine as Google");
	}

	public void browserAI() {
		System.out.println("Gemini help to get the informations quickly");
	}

	public void UI_UX() {
		System.out.println("UI and UX designed by Google ");
	}

	public void incognitoMode() {
		System.out.println("Open window in incognito");
	}

	
	public static void main(String[] args) {
		
		Chrome c = new Chrome();
		c.searchEngine();
		c.incognitoMode();
		c.browserAI();
		c.UI_UX();
		
	}
	
}
