package eda;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{ //Exercicio 1
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		System.out.println("insira primeiro numero");
		a = scan.nextInt();
		System.out.println("insira segundo numero");
		b = scan.nextInt();
		E1.mdc1(a,b);
	

	}

}
