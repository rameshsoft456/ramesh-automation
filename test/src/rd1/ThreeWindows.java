package rd1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThreeWindows {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver d = new FirefoxDriver();
	d.manage().window().maximize();
	d.get("https://www.bing.com");
	d.findElement(By.linkText("MSN")).click();
	String firstName=d.getWindowHandle();
	Set<String> windows = d.getWindowHandles();
	
	Iterator i  = windows.iterator();
	while (i.hasNext()) {
		String window =(String)i.next();
		if (!window.equalsIgnoreCase(firstName)) {
			d.switchTo().window(window);
		}
	}
	
	d.findElement(By.id("q")).sendKeys("selenium");
	String secondWindow=d.getWindowHandle();
	d.findElement(By.xpath("//*[text()='Outlook.com']")).click();
	
	Set<String> windows1 = d.getWindowHandles();
	
	Iterator i1 =windows1.iterator();
	while (i1.hasNext()) {
		String window =(String)i1.next();
		if (!window.equalsIgnoreCase(firstName)&&!window.equalsIgnoreCase(secondWindow)) {
			d.switchTo().window(window);
			Thread.sleep(2000);
		}
	}
	String thirdWindow=d.getWindowHandle();
	System.out.println("1 " +firstName);
	System.out.println("2 " +secondWindow);
	System.out.println("3 " +thirdWindow);
	d.findElement(By.linkText("Sign in")).click();
	
	d.quit();

}
}
