package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTwo {
	@Test
	public void test01() throws Exception
	 {
	 System.out.println("1");
	 Assert.assertEquals("Failed", "Passed");
	 }

}
