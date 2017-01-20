package testng;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;


/*class Test
{	
	@org.testng.annotations.Test(retryAnalyzer=RetryAnalyzer.class)
	public void test01() throws Exception
	 {
	 System.out.println("1");
	 Assert.assertEquals("Failed", "Passed");
	 }
}*/


public class RetryAnalyzer implements IRetryAnalyzer  {
		private int count = 0;
		private int maxCount = 4; // set your count to re-run test
		
		@Override
		public boolean retry(ITestResult result) {
		  /* System.out.println("running retry logic for  '"
		            + result.getName()
		            + "' on class " + this.getClass().getName());*/
		        if(count < maxCount) {                    
		                count++;                                   
		                return true;
		        }
		        return false;
		}
	
}
