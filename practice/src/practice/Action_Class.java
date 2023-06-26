package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?ref=icp_country_us_t1");
		
		Actions a=new Actions(driver);
		
		WebElement account=driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		WebElement lang=driver.findElement(By.xpath("//a[@id=\"icp-nav-flyout\"]"));
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement search_submit=driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		a.moveToElement(account).build().perform();
		a.moveToElement(lang).build().perform();
		
		a.sendKeys(search, "shoes").perform();  //build is called implicitly 
		a.moveToElement(search).keyDown(Keys.SHIFT).sendKeys(" mens").build().perform();
		
		a.click(search_submit).build().perform();
		
		driver.close();
		
		

	}

}
