package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://getcssscan.com/css-buttons-examples");
		WebElement e=driver.findElement(By.cssSelector("button.button-1"));
		System.out.println("button is enabled "+e.isEnabled());
		System.out.println("size "+e.getSize()+" \nLocation/Position(x,y)coordinates "+e.getLocation()+" \nText "+e.getText()+" \ndetails "+e.getCssValue("color"));
		//send keys on button hovers the mouse onto the button 
		Thread.sleep(2000);
		e.sendKeys("asd");
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		

	}

}
