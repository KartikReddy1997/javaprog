package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stalemate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//	driver.findElement(By.cssSelector("input#hide-textbox")).click();//to hide the text box and enter text 
		try{
			driver.findElement(By.cssSelector("input#displayed-text")).sendKeys("he,llo");
			System.out.print("input given");
			}
		
		finally {
			
		driver.close();
		     }
		
	}

}
