package eda;

import java.util.Scanner;

public class Sup 
{
	public static int[] pedirArray()
	{
		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.println("Por favor digite o "+(i+1)+"º numero do array, entre 0 e 999");
			vetor[i] = scan.nextInt();
		}
		System.out.println(" ");
		return vetor;
	}
}
