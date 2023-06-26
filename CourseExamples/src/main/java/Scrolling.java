import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/38091/ind-vs-nz-28th-match-super-12-group-2-icc-mens-t20-world-cup-2021");
		
				
		WebElement table=driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]"));
		WebElement table2=driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[2]"));
		
		
		int sum=0,total=0;
		String extras;
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,300)");
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("C:\\Users\\karthik\\Pictures\\Saved Pictures\\batting.png"));
		
		
		//int rowcount= table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		//System.out.println("row count:"+rowcount+"count "+count);
		
	//////////////////////////////BATING///////////////////////////////////////////	
		
		for(int i=0;i<count-2;i++)
		{
			String score=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			String name=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(1)")).get(i).getText();
			sum=sum+Integer.parseInt(score);
		//	System.out.println(name+" : "+score+" runs");
			System.out.format("%28s%16s \n", name, score);
			
			
		}
		extras=driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[12]/div[2]")).getText();
		
		total=sum+Integer.parseInt(extras);
		System.out.println(sum+"\nextras : "+extras+"\ntotal score : "+total);
		
	///////////////////////////bowling/////////////////////////////////////////
		js.executeScript("window.scroll(0,500)");
		File scr1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr1,new File("C:\\Users\\karthik\\Pictures\\Saved Pictures\\bowling.png"));
		
		int count2=table2.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms \"] div:nth-child(5)")).size();
		
		System.out.println("Bowlers used :"+(count2));
		for(int j=0;j<count2;j++)
		{
			String wickets=driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms ']  div:nth-child(5)")).get(j).getText();
			String name=driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms ']  div:nth-child(1)")).get(j).getText();
			
			System.out.format("%28s%16s wickets \n", name, wickets);
			
			
		}
		
		
	}
	
	
	

}
