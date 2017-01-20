package strings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDe {
public static void main(String[] args) {
	
	WebDriver d = new FirefoxDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com");
	d.findElement(By.id("day")).findElement(By.xpath("//*[text()='1']")).click();

	d.findElement(By.id("day")).findElements(By.xpath("//option")).get(4).click();
	
}
}