
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class implicitWait {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://web-locators-static-site-qa.vercel.app/Wait%20onTime");
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
		//WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
	
		
		System.out.println();
		driver.findElement(By.cssSelector(".uploadContent")).click();

	}

}
