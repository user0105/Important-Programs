package TestNGDemo;
import org.testng.annotations.Test;

public class TestNGAttributePassing {

	@Test(invocationCount=1,alwaysRun=false,priority=7)
	public void m1() {
	System.out.println("m1");
	}

	@Test(priority=5 )
	public void m2() {
	System.out.println("m2");
	}
	
	@Test(priority=6,dependsOnMethods={"m1","m2"})
	public void m3() {
	System.out.println("m3");
	}

 	@Test(priority=0)
	public void b() {
	System.out.println("b");
	}
	
	@Test
	public void a() {
	System.out.println("a");
	}
	
	@Test
	public void c() {
	System.out.println("c");
	
	}
}

/*
1.invocationCount decides how many times your method have to execute 
   when (invocationCount=0) method will not execute   
2.invocation count has more priority than (alwaysRun=true)
3.if we give priority=0 to some method and not assigned priorities to others then it will not change the sequence and get executed at last,
	and if we give more than 0 eg.(Priority=2) then also it will execute at last
4.alwaysRun=false by default.
5.depends on method has more priority than 'priority' 
   first independent method will run first in any condition and then dependent will run regardless of priorities.
   if independent method has not take a part in execution then also dependent method will execute.
6.we can define the method ,dependent on more than one method like ({dependsOnMethods = {"m1","m2"})
7. 
8.
*/
