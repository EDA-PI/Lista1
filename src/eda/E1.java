package eda;

import javax.swing.JOptionPane;

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
		JOptionPane.showMessageDialog(null, "mdc:"+a);
	}

}
