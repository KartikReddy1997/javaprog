package Pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cars {
	
	@Test
	void Car1() {
		
		System.out.println("Car1");
	}	
		
		@BeforeTest
		void Car2() {
			
			System.out.println("Car2");
		}	
		
		
		@AfterTest
		void Car3() {
			
			System.out.println("Car3");
		}	
	

}
