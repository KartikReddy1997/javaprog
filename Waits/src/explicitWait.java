import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://web-locators-static-site-qa.vercel.app/Wait%20onTime");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".uploadContent")));
		driver.findElement(By.cssSelector(".uploadContent")).click();
		w.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".uploadContent")));
		driver.findElement(By.cssSelector(".uploadContent")).click();
	}	

}
