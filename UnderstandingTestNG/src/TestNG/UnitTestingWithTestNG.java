package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UnitTestingWithTestNG 
{

	Calculator Calc;
	int Res;
	@BeforeClass
	public void Init()
	{
		Calc=new Calculator();
		
	}

	@BeforeMethod
	public void InitialiseRes()
	{
		Res=0;
		
	}

	@Test(priority=1)
	public void TestCase1()
	{
		Res=Calc.Addition(10, 20);
		System.out.println(Res);
		Assert.assertEquals(Res, 30);
		
		
	}
	@Test(priority=2)
	public void TestCase2()
	{
		Res=Calc.Addition(0, 0);
		System.out.println(Res);
		Assert.assertEquals(Res,0);
		
	}
	
	@Test(invocationCount=2)
	public void TestCase3()
	{
		Res=Calc.Addition(-1, -1);	
		System.out.println(Res);
		Assert.assertEquals(Res,30);
		
		
	}
	
	@AfterClass
	public void Stop()
	{
		Calc=null;
	}
}
