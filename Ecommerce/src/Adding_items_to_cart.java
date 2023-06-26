import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public  class Adding_items_to_cart  {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
/*		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 
		 List<WebElement> products=driver.findElements(By.xpath("//div[@class='product'] //h4"));
		 
		 for(int i=0;i<products.size();i++) {
			 
			 String s=products.get(i).getText();
			 
			 if(s.contains("Carrot")){
				 
				 driver.findElements(By.xpath("//button[@type='button']")).get(i+1).click(); 

			 }
*/
			 
		driver.get("https://www.primeabgb.com/buy-online-price-india/ram-memory/");
		
		List<WebElement> ram=driver.findElements(By.xpath("//*[@id=\"main\"]/div/div[1]/ul/li"));
		Thread.sleep(2000);
		System.out.println("Products displayed:"+ram.size());
		
		for(int i=0;i<ram.size();i++){
			
			String s=ram.get(i).getText();
			
			if(s.contains("Corsair Vengeance LPX 8GB")) {
				
				driver.findElements(By.xpath("//div[@class='product-innfo'] /h3/a")).get(i+1).click();
				break;
			}
				
		}
		Thread.sleep(5000l);
		driver.findElement(By.name("add-to-cart")).click();
			
		
		 
	}

}

