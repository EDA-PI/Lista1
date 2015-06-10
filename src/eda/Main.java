package eda;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) { // Exercicio 1
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int aux = 99;
		String lol;
		
		JOptionPane.showMessageDialog(null, "Grupo: Ricardo Le Cocq, Eduardo Fernandes, Izabella Lima");
		System.out.println();
		JOptionPane.showMessageDialog(null,"Digite o exercicio a testar:");
		
		// TODOS OS PROBLEMAS USARAO ESTE VETOR PARA OS TESTES.
		int[] vet = {2,5,10,6,4,1,3,7,9,8};

		while (aux != 0) 
		{
			//System.out.println(" ");
			lol =  JOptionPane.showInputDialog(null, "Menuzinho do BACON "
					+ "\n1: lista 1 ex 1 "
					+ "\n2: lista 1 ex 2 "
					+ "\n3: lista 1 ex 3 "
					+ "\n4: lista 2 ex 1 "
					+ "\n5: lista 2 ex 2 "
					+ "\nDigite 0 para sair");
			
			aux = Integer.parseInt(lol);
			switch (aux) 
			{
			case 1:
				lol = JOptionPane.showInputDialog("insira primeiro numero");
				a = Integer.parseInt(lol);
				lol = JOptionPane.showInputDialog("insira segundo numero");
				b = Integer.parseInt(lol);
				E1.mdc1(a, b);break;
			case 2 :
				lol = JOptionPane.showInputDialog("insira primeiro numero");
				a = Integer.parseInt(lol);
				lol = JOptionPane.showInputDialog("insira segundo numero");
				b = Integer.parseInt(lol);
				E2.mdcrec(a, b);break;
			case 3:
				JOptionPane.showMessageDialog(null,"O maior numeor eh: "+E3.vetRec(vet,0,0));break;
			case 4:
				L2E1.BubbleSort(Sup.pedirArray());break;
			case 5:
				L2E2.ordenar(Sup.pedirArray());break;
			case 0:
				JOptionPane.showMessageDialog(null,"Flw Vlw e ateh mais");break;
			default:
				JOptionPane.showMessageDialog(null,"Erro, digite uma opcao valida");break;
				

			}
		}
		scan.close();
	}	
}
