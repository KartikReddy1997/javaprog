import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("ABC");
		driver.findElement(By.name("pass")).sendKeys("XYZ");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("PWD");
		
		
		
	}

}
