import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriver driver1=new ChromeDriver();
		driver.get("https://www.google.com");
		driver1.get("https://www.youtube.com/");
		
	//	driver1.quit();
		driver.findElement(By.name("q")).sendKeys("google");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Gmail")).click();
		driver1.close();
		
	}

}
