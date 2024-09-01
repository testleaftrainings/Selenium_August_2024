package week3.day2;

public class Edge implements Browser{

	public void searchEngine() {
		System.out.println("Default search engine is Bing");
	}

	public void browserAI() {
		System.out.println("Co pilot helps to resolve issues");
	}

	public void UI_UX() {
		System.out.println("UI and UX designed by Microsoft");
	}

	public void incognitoMode() {
		System.out.println("Open window in private mode");
	}

	
	public static void main(String[] args) {
		Edge e = new Edge();
		e.browserAI();
		e.incognitoMode();
		e.UI_UX();
		e.searchEngine();
	}
	
}
