package rd;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailCopy {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.gmail.com");
		WebElement ele =d.findElement(By.id("Email"));
		String color = d.findElement(By.id("Email")).getCssValue("color");
		System.out.println("color is : " +color);
		
		
		File f =d.findElement(By.id("Email")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\prokarma\\un.png"));
		
		d.findElement(By.id("Email")).sendKeys("rameshat914");
		Thread.sleep(2000);
		d.findElement(By.id("Email")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(2000);
		d.findElement(By.id("Email")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
		Thread.sleep(2000);
		d.findElement(By.id("Email")).clear();
		Thread.sleep(2000);
		d.findElement(By.id("Email")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
	}
	
}
