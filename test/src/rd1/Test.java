package rd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
public class Test {
	
	static WebDriver d ;
	static String actualValue="Gmail";
	static String expectedValue=d.getTitle();
	public static void main(String[] args) {		
		d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.gmail.com");
		System.out.println(d.getTitle());
		//Assert.assertTrue(d.getTitle().equalsIgnoreCase("Gmail"));//it should be true
		//Assert.assertFalse(d.getTitle().equalsIgnoreCase("mail"));//it should be false
		//Assert.assertEquals(d.getTitle().equalsIgnoreCase("Gmail"), d.findElement(By.id("Email")).isDisplayed());		
		//Assert.assertEquals(actualValue, expectedValue);
		Assert.assertEquals(d.getTitle().equalsIgnoreCase("Gmail"), d.findElement(By.id("Email")).isDisplayed());
		
		d.findElement(By.id("Email")).sendKeys("rameshsoft.selenium");
		
	}
		
}