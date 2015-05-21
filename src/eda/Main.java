package eda;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // Exercicio 1
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int aux = 99;
		
		System.out.println("Grupo: Ricardo Le Cocq, Eduardo Fernandes, Izabella Lima");
		System.out.println("Digite o exercicio a testar:");
		int[] vet = {2,5,10,6,4,1,3,7,9,8};

		while (aux != 0) 
		{
			System.out.println(" ");
			System.out.println("Menuzinho do BACON");
			System.out.println("1: lista 1 ex 1");
			System.out.println("2: lista 1 ex 2");
			System.out.println("3: lista 1 ex 3");
			System.out.println("4: lista 2 ex 1");
			System.out.println("5: lista 2 ex 2");
			System.out.println("Digite 0 para sair");
			aux = scan.nextInt();
			switch (aux) 
			{
			case 1:
				System.out.println("insira primeiro numero");
				a = scan.nextInt();
				System.out.println("insira segundo numero");
				b = scan.nextInt();
				E1.mdc1(a, b);break;
			case 2 :
				System.out.println("insira primeiro numero");
				a = scan.nextInt();
				System.out.println("insira segundo numero");
				b = scan.nextInt();
				E2.mdcrec(a, b);break;
			case 3:
				System.out.println("O maior numeor eh: "+E3.vetRec(vet,0,0));break;
			case 4:
				L2E1.BubbleSort(Sup.pedirArray());break;
			case 5:
				L2E2.ordenar(Sup.pedirArray());
			case 0:
				System.out.println("Flw Vlw e ateh mais");break;
			default:
				System.out.println("Erro, digite uma opcao valida");break;
				

			}
		}
	}

}
