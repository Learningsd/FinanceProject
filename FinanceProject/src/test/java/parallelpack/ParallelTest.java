package parallelpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	WebDriver driver=null;
	
	@Test
	public void test1()
	{
		System.out.println("1st test is "+Thread.currentThread().getId());
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("2nd test is "+Thread.currentThread().getId());
	}
	@Test
	public void test3()
	{
		System.out.println("3rd test is "+Thread.currentThread().getId());
	}

	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions(); 
		  options.addArguments("--remote-allow-origins=*");
		  
		  driver=new ChromeDriver(options);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("https://www.selenium.dev/downloads/");
		
	}
	
	@AfterMethod
	public void teardown()
	{
	driver.close();
	}
}
