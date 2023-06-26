package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;


public class WebActions_TextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method st
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://web-locators-static-site-qa.vercel.app/Edit ");
		WebElement w=driver.findElement(By.xpath("(//input[@class='Edit_textField'])[1]"));
		Boolean b=w.isEnabled();
		System.out.println("is enabled text box "+b);
		if(b)
		w.sendKeys("Kartik reddy");
		
		
		WebElement w1=driver.findElement(By.xpath("(//input[@class='Edit_textField'])[2]"));
		w1.sendKeys("hello");
		System.out.println(w1.getAttribute("placeholder"));
		Thread.sleep(2000);
		driver.close();
		

	}

}
