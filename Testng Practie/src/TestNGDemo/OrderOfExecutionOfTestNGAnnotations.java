package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderOfExecutionOfTestNGAnnotations {
	
  @Test
  public void Testm1() {
	System.out.println("Testm1");
  }
	
  @BeforeTest
  public void BeforeTest() {
	System.out.println("BeforeTest");
  }
  
  @BeforeSuite
  public void BeforeSuite() {
	System.out.println("BeforeSuite");
  }
  
  @BeforeClass
  public void BeforeClass() {
	System.out.println("BeforeClass");
  }
  
  
  @BeforeMethod
  public void BeforeMethod() {
	System.out.println("BeforeMethod");
  }
  
  @BeforeGroups
  public void BeforeGroup() {
	System.out.println("BeforeGroup");
  }
  
  @AfterGroups
  public void AfterGroup() {
	System.out.println("AfterGroup");
  }
  
  
  @AfterTest
  public void AfterTest() {
	System.out.println("AfterTest");
  }
  
  
  @AfterMethod
  public void AfterMethod() {
	System.out.println("AfterMethod");
  }
  
  
  @AfterClass
  public void AfterClass() {
	System.out.println("AfterClass");
  }
  
  
  @AfterSuite
  public void AfterSuite() {
	System.out.println("AfterSuite");
  }

  @Test
  public void Testm2() {
	System.out.println("Testm2");
  }
  
}


/*
 * The order of execution is
 *  BeforeSuite
	BeforeTest
	BeforeClass
	BeforeMethod
	Testm1
	AfterMethod
	BeforeMethod
	Testm2
	AfterMethod
	AfterClass
	AfterTest
	
	
	
	PASSED: Testm1
	PASSED: Testm2
	
	===============================================
	    Default test
	    Tests run: 2, Failures: 0, Skips: 0
	===============================================
	
	AfterSuite
*/
 
//these all are annotations in testNG.

//====================================================================================================================================================
//What is the difference between @BeforeTest and @BeforeClass???????
/*
 * 
SeleniumAbstractTest.class

public abstract class SeleniumAbstractTest {

  @BeforeSuite
  public void beforeSuite() {
    System.out.println("BeforeSuite");
  }

  @BeforeTest
  public void beforeTest() {
    System.out.println("BeforeTest");
  }

  @BeforeClass
  public void beforeClass() {
    System.out.println("BeforeClass");
  }

  @BeforeMethod
  public void beforeMethod() {
    System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
    System.out.println("AfterMethod");
  }

  @AfterClass
  public void afterClass() {
    System.out.println("AfterClass");
  }

  @AfterTest
  public void afterTest() {
    System.out.println("AfterTest");
  }

  @AfterSuite
  public void afterSuite() {
    System.out.println("AfterSuite");
  }

}
MyTestClass1.class

public class MyTestClass1 extends SeleniumAbstractTest {

  @Test
  public void myTestMethod1() {
    System.out.println("myTestMethod1");
  }

  @Test
  public void myTestMethod2() {
    System.out.println("myTestMethod2");
  }
}
MyTestClass2.class

public class MyTestClass2 extends SeleniumAbstractTest {

  @Test
  public void myTestMethod3() {
    System.out.println("myTestMethod3");
  }

  @Test
  public void myTestMethod4() {
    System.out.println("myTestMethod4");
  }
}
If you have the following Test Suite...

<suite name="Suite">
  <test name="Test1" >
    <classes>
       <class name="MyTestClass2" />
    </classes>
  </test>

  <test name="Test2">
    <classes>
      <class name="MyTestClass1"/>
      <class name="MyTestClass2"/>
    </classes>
  </test>
</suite>
... then the output [indented for easy reading] will be

BeforeSuite
'   BeforeTest
'   '   BeforeClass
'   '   '   BeforeMethod
'   '   '   '   myTestMethod3
'   '   '   AfterMethod
'   '   '   BeforeMethod
'   '   '   '   myTestMethod4
'   '   '   AfterMethod
'   '   AfterClass
'   AfterTest
'   BeforeTest
'   '   BeforeClass
'   '   '   BeforeMethod
'   '   '   '   myTestMethod1
'   '   '   AfterMethod
'   '   '   BeforeMethod
'   '   '   '   myTestMethod2
'   '   '   AfterMethod
'   '   AfterClass
'   '   BeforeClass
'   '   '   BeforeMethod
'   '   '   '   myTestMethod3
'   '   '   AfterMethod
'   '   '   BeforeMethod
'   '   '   '   myTestMethod4
'   '   '   AfterMethod
'   '   AfterClass
'   AfterTest
AfterSuite
Hope it helps :)
*/
/*
@BeforeMethod - executes before every test method e.g. The Method which uses @Test annotation

@BeforeTest - executes only before tag given in testng.xml file.

In a nutshell, @BeforeMethod works on test defined in Java classes. And @BeforeTest works on test defined in testng.xml i.e XML files.
 */