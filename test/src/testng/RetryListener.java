package testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import com.sun.net.httpserver.Authenticator.Retry;

public class RetryListener implements IAnnotationTransformer {
	private int retryCount = 0;
    private int maxRetryCount = 1;

	@Override
	public void transform(ITestAnnotation testannotation, Class testClass,
			Constructor testConstructor, Method testMethod)	{
		IRetryAnalyzer retry = testannotation.getRetryAnalyzer();

		if (retry == null)	{
			testannotation.setRetryAnalyzer(Retry.class);
		}

	}

}


/*class TestOne
{	
	@org.testng.annotations.Test
	public void test01() throws Exception
	 {	
	 Assert.assertEquals("Failed", "Passed");
	 }
	
	@org.testng.annotations.Test
	public void test02() throws Exception
	 {	
	 Assert.assertEquals("Passed", "Passed");
	 }
	
}*/
