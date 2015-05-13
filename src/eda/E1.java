package eda;

public class E1 
{
	public static void mdc1(int a ,int b)
	{
		int aux = a; 
		while(b!=0)
		{
			aux=a%b;
			a=b;
			b=aux;
			
		}
		System.out.println("mdc:"+a);
	}

}
