import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebElement a,b;
		WebDriver driver=new ChromeDriver();
		Actions action=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://codepen.io/parkji/embed/IDibn?default-tab=result");
		
		WebElement y=driver.findElement(By.xpath("//iframe[@class='result-iframe  ']"));
	    driver.switchTo().frame(y);
	  //driver.findElement(By.cssSelector("#result-box > a.run-button > span")).click();
		//driver.findElement(By.xpath("//*[@id=\"result-box\"]/a[2]/span")).click();
		 a=driver.findElement(By.id("item1"));
		 b=driver.findElement(By.xpath("/html/body/div[2]"));
		// action.contextClick(b);
		 action.dragAndDrop(a,b).build().perform();
		driver.switchTo().defaultContent();
	}

}
