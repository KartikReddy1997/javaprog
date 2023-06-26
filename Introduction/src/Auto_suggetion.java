
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Auto_suggetion {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		WebDriverWait x=new WebDriverWait(driver,5);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		driver.findElement(By.cssSelector("#autosuggest")).sendKeys("ind");
		//x.until(ExpectedConditions.visibilityOf((WebElement) By.cssSelector("li[class='ui-menu-item'] a")));
		x.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[class='ui-menu-item'] a")));
		
		/*1.visibilityOf((WebElement) By.cssSelector("li[class='ui-menu-item'] a"))) 
		  2.visibilityOfElementLocated(By.cssSelector("li[class='ui-menu-item'] a")))
		  1&2 are both different 
		 */
		
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option :options)

		{

		if(option.getText().equalsIgnoreCase("India"))

		{

		option.click();

		break;

		}
		
		
	}

}
}
