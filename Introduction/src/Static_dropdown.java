

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class Static_dropdown {

	public static void main(String[] args) throws InterruptedException {
	/*	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		WebElement x=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select dropdown=new Select(x);
		Thread.sleep(1000);
		dropdown.selectByValue("AED");
		*/
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		MultiStaticDropdown(driver);
	}
	
	
	
	
	public static void SingleStaticDropdown(WebDriver driver) {
		
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Select x=new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));		
		x.selectByIndex(2);	
		System.out.println(x.getFirstSelectedOption().getText());
		x.selectByVisibleText("INR");
		x.selectByValue("USD");
		
		/*  List <WebElement> op = x.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
		*/
		
		
	}
	
	public static void MultiStaticDropdown(WebDriver driver) throws InterruptedException {
		driver.get("https://semantic-ui.com/modules/dropdown.html#multiple-selection");
		driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div")).click();
		Thread.sleep(5000);
		Select x=new Select(driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/select")));
		Thread.sleep(2000);
		x.selectByValue("angular");
		
		
		
	}

}
