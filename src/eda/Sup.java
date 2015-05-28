package eda;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sup 
{
	public static int[] pedirArray()
	{
		String lol;
		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];
		for(int i=0;i<10;i++)
		{
			lol = JOptionPane.showInputDialog("Por favor digite o "+(i+1)+"º numero do array, entre 0 e 999");
			vetor[i] = Integer.parseInt(lol);
		}
		scan.close();
		return vetor;
		
	}
}
