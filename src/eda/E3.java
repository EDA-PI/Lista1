package eda;

public class E3 
{
	public static int vetRec(int[] vet, int maior, int indice)
	{
		while(indice<vet.length)
		{
			
			if(vet[indice]>maior)
				maior = vet[indice];
			indice++;
			vetRec(vet,maior,indice);
			
		}
		return maior;
			
	}

}
