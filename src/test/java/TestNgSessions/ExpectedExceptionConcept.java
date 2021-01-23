package TestNgSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	
@Test(expectedExceptions = ArithmeticException.class)
public void divTest() {
	System.out.println("div Test");
}
	
	int i = 9 / 0;{
	
	System.out.println(" finsh div Test");
	
	}

}
