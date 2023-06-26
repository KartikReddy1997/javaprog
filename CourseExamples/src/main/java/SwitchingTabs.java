import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchingTabs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions at=new Actions(driver);
		List<String> x = new ArrayList<String>();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		
		
		int size=driver.findElements(By.xpath("(//span[@class=\"clearfix offer-li-wrap\"] /span[@class=\"offer-img\"])")).size();
		
			for(int i=0;i<size;i++)
		     {
		    	 WebElement w=driver.findElements(By.xpath("(//span[@class=\"clearfix offer-li-wrap\"] /span[@class=\"offer-img\"])")).get(i);
		    	at.moveToElement(w).keyDown(Keys.CONTROL).click().build().perform();
		     }

		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			String nexttab=it.next();
			x.add(nexttab);
			
		}
		System.out.println(x.size());
		for(int j=x.size()-1;j>=0;j--)
		{
			System.out.println(driver.switchTo().window(x.get(j)).getTitle());
			
		}
		
		
	}

}
