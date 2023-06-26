import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Action {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions a=new Actions(driver);
		WebElement link,search,search1;
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		String carname;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		
		search=driver.findElement(By.name("q"));
		search.sendKeys("Tata electric car");
		search.submit();
	//	a.click(search).build().perform();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rso']/div[1]/div/div/div[1]/a/h3")));
		link=driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div[1]/a/h3"));
		a.moveToElement(link).keyDown(Keys.CONTROL).click().build().perform();
		
		Set<String> window=driver.getWindowHandles();
		Iterator<String> x=window.iterator();
		String parent=x.next();
		String child=x.next();
		//System.out.println(parent+child);
		driver.switchTo().window(child);
		
		carname=driver.findElement(By.xpath("//div[@class='overview-menu-desktop']/ul/li[1]/a")).getText();
		System.out.println(carname);
		driver.switchTo().window(parent);
		
		search1=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/div/div[2]/input"));
		
		a.click(search1).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(carname+" price").perform();
		search1.submit();
		
	}

}
