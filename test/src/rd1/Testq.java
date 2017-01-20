package rd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testq {

	@Test
	public void script2() throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.gmail.com");
		d.findElement(By.xpath("//input[ends-with(@id,'mail')]")).sendKeys("rameshsoft.selenium");
		//d.findElement(By.id("Email")).sendKeys("rameshsoft.selenium");
		d.findElement(By.id("next")).click();
		Thread.sleep(33000);
		d.findElement(By.id("Passwd")).sendKeys("rameshsoft.selenium");
		d.findElement(By.id("signIn")).click();;

	}
	
}
