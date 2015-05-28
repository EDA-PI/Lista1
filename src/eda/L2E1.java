package eda;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class L2E1 
{
	 public static void BubbleSort(int _vet[])
	 {
		 int[] vet = _vet;
		 boolean troca = true;
		 int aux;
		 while (troca) 
		 {
		     troca = false;
		     for (int i = 0; i < vet.length - 1; i++) 
		     {
		         if (vet[i] > vet[i + 1]) 
		         {
		             aux = vet[i];
		             vet[i] = vet[i + 1];
		             vet[i + 1] = aux;
		             troca = true;
		         }
		     }
		 }
		 JOptionPane.showMessageDialog(null, "O vetor ordenado ficou: " + Arrays.toString(vet));		 
	 }
}
