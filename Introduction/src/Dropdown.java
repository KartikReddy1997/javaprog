import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	
		driver.findElement(By.id("hrefIncAdt")).click();
		
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		//driver.findElement(By.xpath("//div[@id='divpaxinfo']")).clear();
		//only text field will get clear
	
	
	}
	
	

}
