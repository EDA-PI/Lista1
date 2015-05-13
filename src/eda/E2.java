package eda;

public class E2 
{
	public static void mdcrec(int a , int b)
	{
		if(a%b!=0)
		{
			mdcrec(b,a%b);
		}
		else
			System.out.println("MDC = "+b);
		
	}
	

}
