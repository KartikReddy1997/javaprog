import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();		
		driver.get("https://www.google.com/");		
		driver.switchTo().newWindow(WindowType.WINDOW); //for opening a new url in new window
		driver.get("https://www.youtube.com/");
		driver.switchTo().newWindow(WindowType.TAB);  //for opening a new url in new TAB
		driver.get("https://www.netflix.com/in/login");
				
		Set<String> s=driver.getWindowHandles();
		
		
	    switchingTabs(driver,s, "youtube.com"); //switching to a tab to perform action in the page
	    driver.quit();

	}
	
	public static void switchingTabs(WebDriver driver, Set<String> window,String windowName) {
	    
		  
	        for (String windowHandle : window) {
	            driver.switchTo().window(windowHandle);
	            if (driver.getCurrentUrl().contains(windowName)) {
	                // Perform actions in the desired window
	                System.out.println("Switched to window: " + windowHandle);
	                System.out.println("Current URL: " + driver.getCurrentUrl());
	                // Add your code here to interact with the desired window
	                break;
	            }
	}

}
}
