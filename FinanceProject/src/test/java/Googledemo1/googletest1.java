package Googledemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googletest1 
{

	WebDriver driver;
	
	@Test(priority = 0)
	public void googletesting()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");
	}
	
	
	@Test(priority = 1)
	
	public void googletesting1()
	{
		String name=driver.getTitle();
		Assert.assertEquals(name, "Google");
		
		
	}
	
@Test(priority = 2)
	
	public void googletesting2() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		
		
	}

@Test(priority = 3)

public void googletesting3() throws InterruptedException
{
	driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3")).click();
	Thread.sleep(1000);
	String javaname=driver.getTitle();
	System.out.println(javaname);
	//Assert.assertEquals(javaname, "Java |Oracle");
}
}
