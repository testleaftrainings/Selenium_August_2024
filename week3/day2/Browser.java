package week3.day2;

public interface Browser {// Design to build/develop/create Browser

	public void searchEngine();
	
	public void browserAI();
	
	public void UI_UX();
	
	public void incognitoMode();
	
	
	default void downloadLocation() {
		System.out.println("C://downloads");
	}
	
	
	
}
