package TestNGDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	/*@DataProvider(name="dp")
	public static Object [][] td() {
	 Object [][] d =new Object[2][2];
	 d[0][0]=15;
	 d[0][1]=51;	 
	 d[1][1]=84;
     d[1][2]=18;		 
	return d;
	}
	
	@Test(dataProvider="dp")
	public void m1() {
		System.out.println(d[1][1]);
	}	*/
	

    @DataProvider(name="LoginDataProvider" )
    public String[][] LgnData()
	{
	 String [][] b={{"user1","pass1"},
			        {"user2","pass2"},
			        {"user3","pass3"}
/*			        {"sk","sk1"}*/};
	 return b;
	}
	
    @Test(dataProvider="LoginDataProvider" ,enabled=true)
	private void m1(String uname,String pass) throws Exception 
	{
		if(uname.contains("user") && pass.contains("pass"))
		{
			System.out.println(uname+"\t"+pass);
		}else{
			 //  throw new  InvalidUsernameOrPasswordException();
			     throw new  Exception();
		     }
	}
	
    @DataProvider(name="StudentInfo")
	 public Object[][] m2(){
		String [][] a ={
						{"yash","21"},
						{"jay","45"},
						{"kamat","51"}
						};
		return a;
	}

    @Test(dataProvider="StudentInfo")
	public void chk(String uname,String age1) {
		System.out.println(uname+"\t "+age1);
	}	
}
//for more refer project selenium 'zc' package class t1 t2 t3