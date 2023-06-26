package TestListener;

import org.testng.annotations.*;


public class Sample {
	
	
	@BeforeTest
	@BeforeClass
public static void BeforeTestCase() {
		
		System.out.println("Before Test Cases method ");
	}
	
	@BeforeClass
	public static void SampleTest() {
		
		System.out.println("Before class method ");
	}
	
	@BeforeMethod
	public static void SampleBeforeMethod() {
		
		System.out.println("This is Before Method");
	}
	
	@Test
	public static void Samplecase() {
		
		System.out.println("Test1");
	}
	@Test
	public static void Samplecase1() {
		
		System.out.println("Test2");
	}
	
	
	@AfterClass
	public static void SampleAfterClass() {
		
		System.out.println("After class method ");
	}
	
	@AfterMethod
	public static void SampleAfterMethod() {
		
		System.out.println("This is After Method");
	}

}
