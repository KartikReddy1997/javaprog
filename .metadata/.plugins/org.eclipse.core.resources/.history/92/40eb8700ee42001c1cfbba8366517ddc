import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingDriver {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException  {
		// TODO Auto-generated method stub
			
		
		
	}

	 public  WebDriver set(int x){
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			implicitwait( x,driver);
			
			return driver;
		
	}
	 
	 public  void implicitwait(int n,WebDriver driver) {
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 }
	 
	 
	 
}
