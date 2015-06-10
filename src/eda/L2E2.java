package eda;

import java.util.ArrayList;

import javax.swing.JOptionPane;



public class L2E2 
{
	public static void ordenar(int[] vetor)
	{
		ArrayList<Integer> lista = new ArrayList<>();
	    lista = ordenar(vetor, 0, vetor.length - 1);
	    JOptionPane.showMessageDialog(null,lista.toString());
	}
	
	private static ArrayList<Integer> ordenar(int[] vetor, int inicio, int fim)
	{
		
		
		
	   if (inicio < fim)
	   {
	      int posicaoPivo = separar(vetor, inicio, fim);
	      ordenar(vetor, inicio, posicaoPivo - 1);
	      ordenar(vetor, posicaoPivo + 1, fim);
	   }
	   
	   	ArrayList<Integer> lista = new ArrayList<>();
		for(int x : vetor)
		{
			lista.add(x);
		}
	  return lista;
	}
	
	private static int separar(int[] vetor, int inicio, int fim)
	{
	   int pivo = vetor[inicio];
	   int i = inicio + 1, f = fim;
	   while (i <= f)
	   {
	      if (vetor[i] <= pivo)
	         i++;
	      else if (pivo < vetor[f])
	         f--;
	      else
	      {
	         int troca = vetor[i];
	         vetor[i] = vetor[f];
	         vetor[f] = troca;
	         i++;
	         f--;
	      }
	   }
	   vetor[inicio] = vetor[f];
	   vetor[f] = pivo;
	   return f;
	}
}
