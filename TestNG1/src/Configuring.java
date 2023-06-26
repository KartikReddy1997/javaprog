import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



public class Configuring {

	public WebDriver driver;
	@BeforeMethod(groups={"smoke"})
	void Driver() {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("website opened");
		driver.get("https://www.google.com/");
	}
	
	
	@Test
	void CheckUrl() {
		//System.out.println(driver.getCurrentUrl());
		System.out.println("opened required URL : "+driver.getCurrentUrl().equalsIgnoreCase("https://www.google.com/"));
		
		
	}
	
	
	@Test(groups={"smoke"})
	public void Gettitle() {
		String s=driver.getTitle();
	System.out.println("Page Title : "+s);
		
	}

	
	@AfterMethod(groups={"smoke"})
	public void CloseVrowser() {
		System.out.println("website closed");
		System.out.println();
		driver.quit();
	}
	
	
}
