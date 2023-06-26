package UserLogin;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.*;

import TestDataUtil.Data;


public class Configuring {
	
	public static WebDriver driver;

	
	@DataProvider
	public Object[][] getData() throws IOException {
		
		Object[][] o=Data.getData("logindetails");
		return o;
		
	}
		
	
	@Parameters({"URL"})
	@BeforeMethod()
	public void Driver(String URL) {
	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(URL);
	}

	//Test1
	
	@Test
	public void CheckUrl() {
		//System.out.println(driver.getCurrentUrl());
		System.out.println("opened required URL : "+driver.getCurrentUrl().equalsIgnoreCase("https://www.mockplus.com/"));
	}
	
	//Test2
	
	@Test(dataProvider="getData")
	public void Validate(String username,String password) throws InterruptedException {
		String mail=username;
		String pwd=password;
		
		//driver.findElement(By.xpath("/html/body/section/div[2]/div/i")).click();
	//	driver.findElement(By.cssSelector("a[class='login']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(mail);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@id='login']")).click();
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
		

	Assert.assertEquals("Mockplus - Design, Prototype & Collaborate better and faster", title,"invalid credentials" );

	}
		
	@Test
	public void Gettitle() {
		String s=driver.getTitle();
	System.out.println("Page Title : "+s);
		
	}
			
	@AfterMethod()
	public void CloseBrowser() {
	//	System.out.println("website closed");
		System.out.println();
		driver.quit();
	}
	
	
	
	public static void TakeScreenshot(String name) throws IOException {
		
		String s="D:\\selenium\\Screenshots\\image"+name+".png";
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(s));
		
		
		
	}
	
	
	
	
}
