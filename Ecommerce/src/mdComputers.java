import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mdComputers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
//		String items[]= {"a","b"};
		driver.get("https://mdcomputers.in");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input.autosearch-input.form-control")).sendKeys("Ram");
		
		
		List<WebElement> x=driver.findElements(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div[1]/div/div[2]/h4/a"));
		for(int i=0;i<x.size();i++) {
		
//		String products=x.get(i).getText();
		
		
		
		}

}
}