import org.testng.annotations.*;

public class BeforeSuiteTest {

	
	@BeforeSuite
	public void BeforeSuit1() {
		
		System.out.println("Test Suite Execution Start");
				
	}
	
	
	
	@AfterSuite
	public void AfterSuite1() {
		
		System.out.println("After Test Suite exection ends");
	}
	
}
