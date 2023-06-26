package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_search {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
	
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("hello");
		
		driver.manage().window().maximize();
		
		//driver.close();
		
	}

}
