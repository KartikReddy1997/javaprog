import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BrokenLinks extends CreatingDriver {

	public static void main(String[] args) throws MalformedURLException, IOException  {
		
		BrokenLinks x=new BrokenLinks();
		WebDriver driver=x.set(5);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		
		
		String url=driver.findElement(By.linkText("Broken Link")).getAttribute("href");
		
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int resT=conn.getResponseCode();
		System.out.println(resT);
		
		
		
}
	}
