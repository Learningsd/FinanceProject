package financeTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void BIKE() 
  {
	  System.out.println("RUNNING");
	  
  }
  @Test
  public void CAR() 
  {
	  System.out.println("RUNNING THAT IS RUNNING SPEED IS 150KM/H");
	  
  }
  
  @BeforeClass
  
  public void beforeClass() 
  {
	  System.out.println("START"); 
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("STOP");
  }
  
@BeforeMethod
  
  public void beforeMethod() 
  {
	  System.out.println("i need a url"); 
  }

@AfterMethod

public void afterMethod() 
{
	  System.out.println("i need close url"); 
}
  
  

}
