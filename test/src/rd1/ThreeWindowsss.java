package rd1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThreeWindowsss {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver d = new FirefoxDriver();
	d.manage().window().maximize();
	d.get("https://www.bing.com");
	d.findElement(By.linkText("MSN")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("//*[text()='Outlook.com']")).click();
	String firstName=d.getWindowHandle();
	Set<String> windows = d.getWindowHandles();	
	List l = new ArrayList(windows);
	d.switchTo().window((String) l.get(1));
	d.findElement(By.id("q")).sendKeys("selenium");
	Thread.sleep(2000);
	d.switchTo().window((String) l.get(2));
    d.findElement(By.linkText("Sign in")).click();
    Thread.sleep(5000);
	d.quit();
}
}
