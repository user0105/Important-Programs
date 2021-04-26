package TestNGDemo;

import org.testng.annotations.Test;

public class GroupsInTestNG {

     	@Test(alwaysRun=true,groups={"functional","smoke"})
     	public void m1() {
		System.out.println("method m1");
		}
     	
     	@Test(invocationCount=1,groups={"sanity","regression"})
     	public void m2() {
		System.out.println("method m2");
		}
     	
     	@Test(groups={"functional","windows.smoke"})
     	public void m3() {
		System.out.println("method m3");
		}
     	
     	@Test(groups="smoke")
     	public void m4() {
		System.out.println("method m4");
		}
     	
     	@Test(groups="windows.sanity")
     	public void m5() {
		System.out.println("method m5");
		}
     	
     	@Test(groups="regression")
     	public void m6() {
		System.out.println("method m6");
		}
}

//Groups are case sensitive so take proper care while mentioning them in testng.xm
/*
  <groups>
     <run>
      <include name="windows.*"></include>
      <include name="sanity"></include>
     </run>
   </groups> 
 */

/*
 * Parallelism in testNG
 * 
	 * 1.How to run the test cases in parallel
	 --) Parallel execution in TestNG
	After creating xml file as shown above, in next step, we will execute the parallel test. Below is the code.
	
	TestNG: Execute multiple Test Suites
	
	1) thread-count: This is used for parallel execution, based on the number script. It will execute in parallel or sequential order.
	
	2) verbose: It is used to log the execution details in the console. The value should be 1-10. The log details in the console window will get more detailed and clearer as you increase the value of the verbose attribute in the testng.xml configuration file.
	
	3) name: Name of the suite. Here it is "Gmail Suite"
	
	4) Parallel: To run scripts parallel, value can be tests/classes/methods/suites. Default value is none
	
	Right click on the testing.xml and select run as testing, once successful you'll see all the results 
 * 
 */