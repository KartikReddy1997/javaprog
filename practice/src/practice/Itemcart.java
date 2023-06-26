package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Itemcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> items = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < items.size(); i++) {
			String s=items.get(i).getText();
			if(s.contains("Cucumber"))
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			
		}
	}

}
