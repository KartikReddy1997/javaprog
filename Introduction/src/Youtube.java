import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("bella ciao");
		driver.findElement(By.xpath("//*[@id=\'search-icon-legacy\']/yt-icon")).click();
	
		driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
		//driver.findElement(By.id("play")).click();
		

	}

}
