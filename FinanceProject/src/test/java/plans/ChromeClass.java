package plans;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ChromeClass {
	WebDriver driver=null;
  @Test 
  public void test1()
  {
	  driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
	  String title=driver.getTitle();
	  System.out.println("my title of page is "+title);
	  Assert.assertEquals("Downloads | Selenium", title);
	 
  }
  
  @Test
  public void test2() 
  {
	 
	  driver.findElement(By.xpath("//a[text()='Maven repository']")).click();
	  
	 
	 WebElement text= driver.findElement(By.xpath("//h1[text()='org/seleniumhq/selenium']"));
	String info= text.getText();
	
	System.out.println("heading is"+info);
	Assert.assertEquals("org/seleniumhq/selenium", info);
  }
  
  
 
  
  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) 
  {
	 //System.setProperty("webdriver.chrome.driver", "H:\\Driver\\drivers-latest\\Chomedriver-2024\\chromedriver-win64\\chromedriver.exe");
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeOptions options = new
		 * ChromeOptions(); options.addArguments("--remote-allow-origins=*"); driver=new
		 * ChromeDriver(options);
		 */
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  ChromeOptions options = new ChromeOptions(); 
		  options.addArguments("--remote-allow-origins=*");
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver(options);	  
	  }else if(browser.equalsIgnoreCase("Edge"))
	  {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
	  }
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://www.selenium.dev/downloads/");
	  
	  
  }

  @AfterClass(alwaysRun=true)
  public void afterClass() 
  {
	  driver.quit();
	  
  }

}
