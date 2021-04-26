package TestNGDemo;

import org.testng.annotations.Test;

public class ParametersTestNG {
	
	@Test
	public void m1() {
	System.out.println("m1");
	}

	@Test
	public void m2() {
	System.out.println("m2");
	}
	
	@Test
	public void m3() {
	System.out.println("m3");
	}
	
	@Test
	public void m4() {
	System.out.println("m4");
	}
	
	@Test
	public void m5() {
	System.out.println("m5");
	}
	
	@Test
	public void b() {
	System.out.println("b");
	}
	
	@Test
	public void A() {
	System.out.println("A");	
	}
	
	@Test
	public void c() {
	System.out.println("c");
	}
	
	
}

/*
 *1. methods run in given ALPHABEETICAL order unless they are arranged using parameters
 *2. order of execution of methods can be changed by assigning parameters to them
 *  
 *  
 *  A
 *  b
 *  c
 *  m1
	m2
	m3
	m4
	m5
	
	PASSED: A
	PASSED: m1
	PASSED: m2
	PASSED: m3
	PASSED: m4
	PASSED: m5
	
	
	===============================================
	    Default test
	    Tests run: 6, Failures: 0, Skips: 0
	===============================================
	
	
	===============================================
	Default suite
	Total tests run: 6, Failures: 0, Skips: 0
	===============================================
*/

/*
	 * 2. TestNG @Parameters – Optional parameters
	TestNG also provides an option to provide optional parameters, this value will be used if parameter value is not found in the defined file.
	
	2.1. Test with @Optional annotation
	To pass optional parameters, use @Optional annotation.
	
	ParameterTest.java
	package com.howtodoinjava.test;
	 
	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	 
	public class ParameterTest
	{
	    @Parameters({ "optional-value" })
	    @Test
	    public void optionTest(@Optional("optional value") String value) {
	        System.out.println("This is: " + value);
	    }
	}
	The preceding class file contains a single test method that takes one parameter as input. The said test method on execution prints the parameter value that is passed onto the console using the System.out.println method.
	
	The parameter value is passed to the test method using the parameter named optional-value from the XML file. An optional value for the said parameter is defined using the @Optional annotation against the said parameter.
	
	2.2. Test with @Optional annotation
	In this testng.xml file has two tests defined above. No parameter is defined in the first test where as the second test declares a parameter named ‘optional-value‘ in it.
	
	testng.xml
	<suite name="Optional test Suite" verbose="1">
	 
	  <test name="Optional Test one">
	    <classes>
	      <class name="test.parameter.OptionalTest" />
	    </classes>
	  </test>
	 
	  <test name="Optional Test two">
	    <parameter name="optional-value" value="passed from xml" />
	    <classes>
	      <class name="test.parameter.OptionalTest" />
	    </classes>
	  </test>
	 
	</suite>
	2.3. Demo
	Output of running above code as test suite is :
	
	Console
	[TestNG] Running: C:\somepath\testng.xml
	 
	This is: optional value
	This is: passed from xml
	 
	===============================================
	Optional test Suite
	Total tests run: 2, Failures: 0, Skips: 0
	===============================================
	As you can see from the previous test results, TestNG has passed the optional value to the test method during first test
	execution. This happened because TestNG was unable to find a parameter named optional-value in the XML file from the 
	first test.
	
	During the second test it found the parameter value in the XML and passed the said value to the test method during 
	execution.
 * */ 
