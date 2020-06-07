package TestNG;

public class TestCalculator{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		//This should happen first
		Calculator Cal=new Calculator();
		int Res=0;
		
		//TestCase 1
		Res=Cal.Addition(10, 20);
		
		if(Res==20)
			System.out.println("Addition works fine with Positive numbers");
		else
			System.out.println("Addition does not work fine with Positive numbers");
	
	
		//This should happen before calling NEXT Testcase
		Res=0;
		
		//This is TestCase2
		Res=Cal.Addition(0, 0);
		
		if(Res==0)
			System.out.println("Addition works fine with 0 numbers");
		else
			System.out.println("Addition does not work fine with 0 numbers");
	
	
		
		Res=0;
		
		//This is TestCase3
		Res=Cal.Addition(-1, -1);
		
		if(Res==-2)
			System.out.println("Addition works fine with Negative numbers");
		else
			System.out.println("Addition does not work fine with Negative numbers");
	
		Cal=null;
	
	}
}