import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
	
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		

while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
{
driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
}
		
		int count=driver.findElements(By.xpath("(//table[@class='table-condensed'] /tbody)[1]")).size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			String date=driver.findElements(By.xpath("(//table[@class='table-condensed'] /tbody)[1]")).get(i).getText();
			
			if(date.equalsIgnoreCase("12")){
				driver.findElements(By.xpath("(//table[@class='table-condensed'] /tbody)[1]")).get(i).click();
				break;
			}
		}

	}

}
