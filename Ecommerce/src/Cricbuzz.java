import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Cricbuzz {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//span[@class=\"cb-caret-down\"])[2]"))).perform();
		driver.findElement(By.xpath("//*[@id=\"seriesDropDown\"]/nav/a[1]")).click();
		
		driver.findElement(By.xpath("//a[@title=\"ICC Mens T20 WC 2021 Stats\"]")).click();
		driver.findElement(By.xpath("//a[@class=\"cb-col cb-col-100 cb-series-brdr cb-stats-lft-ancr cb-stats-lft-tab-active\"]")).click();
		String name=driver.findElement(By.xpath("//*[@id=\"seriesStatsTable\"]/div/table/tbody/tr[1]/td[2]/a")).getText();
		System.out.println("Highest runs  "+name);
	}

}
