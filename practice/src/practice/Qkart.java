package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
		  driver.findElement(By.xpath(
                  "//input[@name='search']")).clear();
          driver.findElement(By.xpath("//input[@name='search']")).sendKeys("shoes ");
          
          Thread.sleep(5000);

         boolean x=false,y=false;
          x = driver.findElement(By.xpath("//button[text()='Size chart']")).isDisplayed();
          y = driver.findElement(By.xpath("//button[text()='Size chart']")).getText().equalsIgnoreCase("Size chart");
                  System.out.println("is displayed "+x+" Text check"+y);
          
                  
                  List<WebElement> searchResults ;
                  
                      // TODO: CRIO_TASK_MODULE_TEST_AUTOMATION - TEST CASE 05: MILESTONE 4
                      /*
                       * Iterate through each product on the page to find the WebElement corresponding
                       * to the matching productName
                       * 
                       * Click on the "ADD TO CART" button for that element
                       * 
                       * Return true if these operations succeeds
                       */
               
                      searchResults = driver.findElements(By.xpath("//*[@id='root']/div/div/div[3]/div[1]/div[2]/div/div"));
                      int i=0;
                      for (WebElement item : searchResults) {

                          String s = item
                                  .findElements(
                                          By.xpath("//div[@class='MuiCardContent-root css-1qw96cp']/p[1]")).get(i)
                                  .getText();
                          Thread.sleep(5000);
                          System.out.println("String = "+s);

                          if (s.equalsIgnoreCase("Nike Mens Running Shoes")) {
                             driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
                             

                          }
                          else {
                        	  System.out.println("Unable to find the given product");
                          }
                          i++;
                      }

                     
                     
                  
	}

}
