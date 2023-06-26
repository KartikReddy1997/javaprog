package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.cssSelector("a[data-uia=\"header-login-link\"]")).click();
		
		String title;
		
		title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.cssSelector("input#id_userLoginId")).clear();
		driver.findElement(By.cssSelector("input#id_userLoginId")).sendKeys("Netflixpackage999@gmail.com");
		
		driver.findElement(By.cssSelector("input#id_password")).clear();
		driver.findElement(By.cssSelector("input#id_password")).sendKeys("Lol12345");
					
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	
		title=driver.getTitle();
		System.out.println(title);
			
		
		
	}

}
