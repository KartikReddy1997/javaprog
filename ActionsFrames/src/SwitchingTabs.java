import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class SwitchingTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		List<String> s = new ArrayList<String>();
	//	Actions a=new Actions(driver);
		
		driver.get("https://www.cricbuzz.com/cricket-stats/icc-rankings/men/batting");
		WebElement testplayers=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div/div[1]"));
		List<WebElement> player=testplayers.findElements(By.tagName("a"));
			
				
		for(int i=0;i<10;i++) {
			
		System.out.println(player.get(i).getText());
		String clickon=Keys.chord(Keys.CONTROL,Keys.ENTER);
		player.get(i).sendKeys(clickon);
			Thread.sleep(2000l);
			}
		
		Set <String> abc =driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
	
		while(it.hasNext())
		{
			s.add(it.next());
		//   driver.switchTo().window( it.next());
		 //  System.out.println(driver.getTitle());
		
		}
			System.out.println(s.size());
		int rank=1;
		for(int j=s.size()-1;j>0;j--)
		{
			driver.switchTo().window(s.get(j));
			String name=driver.findElement(By.xpath("//h1[@class=\"cb-font-40\"]")).getText();
			String Country=driver.findElement(By.xpath("//h3[@class='cb-font-18 text-gray']")).getText();
			System.out.println("Name:"+name+"  Country:"+Country+"  Rank"+rank);
			
			rank++;
			
		}
			
	}

}
