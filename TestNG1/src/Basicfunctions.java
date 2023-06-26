import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Basicfunctions {
static WebDriver driver;

@BeforeTest
public  void Driver() {
	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("website opened Basic Funtions Before Test");
	driver.get("https://www.google.com/");
	
}

@Test
public void SearchCar() {
	
driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Nexon EV");
driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();	
}

@Test
public void SearchBike() {
	
	driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Apache rtr 2004v");
driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();	
}


@AfterMethod
public  void clear() {
	driver.navigate().back();
	driver.findElement(By.cssSelector(".gLFyf.gsfi")).clear();
	
	
}

@AfterClass
public void ClosingBrowser() {

	driver.close();
	
}
}





