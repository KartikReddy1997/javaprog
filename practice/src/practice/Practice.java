package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> s =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		
		for(WebElement option :s)	{
			if(option.getText().equalsIgnoreCase("India"))	
			option.click();
			break;

		}
		
		//driver.close();
		
		
		
	}
}

