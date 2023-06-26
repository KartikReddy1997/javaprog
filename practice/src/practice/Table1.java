package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int rows=driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr")).size();
		List <WebElement> head=driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr[1]/th"));
		int i=0,sum=0;
		for(WebElement element : head){
			i++;
			String s=element.getText();
			
			if(s.contains("Course")) {
				for(int n=2;n<rows;n++) {
					String x=driver.findElement(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr["+n+"]/td["+i+"]")).getText();
					System.out.println(x);
				}
				
				}
			if(s.contains("Price")) {
				for(int n=2;n<rows;n++) {
					String x=driver.findElement(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr["+n+"]/td["+i+"]")).getText();
					 sum=sum+Integer.valueOf(x);
					 
				}
				
				}
			}
		System.out.print("Total fee === "+sum);

	}

}
