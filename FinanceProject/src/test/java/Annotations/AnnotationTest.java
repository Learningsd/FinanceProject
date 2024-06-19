package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationTest {
  @Test
  public void T1() 
  {
	  System.out.println("THIS IS MY 1ST TESTCASE");
	  
  }
  
  @Test
  public void T2() 
  {
	  System.out.println("THIS IS MY 2ND TESTCASE");
	  
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("THIS IS BEFORE METHOD");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("THIS IS AFTER METHOD");
	  
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("THIS IS BEFORE CLASS");
  }
  

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("THIS IS AFTER CLASS");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("THIS IS BEFORE TEST");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("THIS IS AFTER TEST");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("THIS IS BEFORE SUIT");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("THIS IS AFTER SUIT");
	  
  }

}
