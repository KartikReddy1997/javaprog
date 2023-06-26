import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		/*driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());*/
		driver.findElement(By.id("populate-text")).click();
		w.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[@class=\"target-text\"]"),"Selenium Webdriver"));
		System.out.println(driver.findElement(By.xpath("//h2[@class=\"target-text\"]")).getText());
		
		
	}

}
