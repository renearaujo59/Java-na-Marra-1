package javanamarra;

public class AcessoPosicoesVetor
{
	public static void main( String[] args )
	{
		int[] vetor = new int[3];
		int i;

		vetor[0] = 0;
		vetor[1] = 0;
		vetor[2] = 0;

		System.out.println("Vetor contem: " + vetor[0] + " " + vetor[1] + " " + vetor[2]);

		// Preenche cada posicao com um valor aleatorio entre 1 e 100'
		vetor[0] = 1 + (int)(Math.random()*100);
		vetor[1] = 1 + (int)(Math.random()*100);
		vetor[2] = 1 + (int)(Math.random()*100);

		// Mostra os valores novamente.
		System.out.println("Vetor contem: " + vetor[0] + " " + vetor[1] + " " + vetor[2]);

		// Esse eh meio bobo. Mas tente entender.
		i = 0;
		vetor[i] = 1 + (int)(Math.random()*100);
		i = 1;
		vetor[i] = 1 + (int)(Math.random()*100);
		i = 2;

		vetor[i] = 1 + (int)(Math.random()*100);

		// Mostra os valores novamente.
		System.out.print("vetor contem: ");
		i = 0;
		System.out.print(vetor[i] + " ");
		i = 1;
		System.out.print(vetor[i] + " ");
		i = 2;
		System.out.print(vetor[i] + " ");
		System.out.println();

		//Esse eh ainda mais bobo, mas funciona.
		i = 0;
		vetor[i] = 1 + (int)(Math.random()*100);
		i++;
		vetor[i] = 1 + (int)(Math.random()*100);
		i++;
		vetor[i] = 1 + (int)(Math.random()*100);
		i++;

		// Mostra novamente.
		System.out.print("vetor contem: ");
		i = 0;
		System.out.print(vetor[i] + " ");
		i++;
		System.out.print(vetor[i] + " ");
		i++;
		System.out.print(vetor[i] + " ");
		i++;
		System.out.println();

		// Ah! e vamos usar um laço for comum
		for ( i=0 ; i < vetor.length ; i++ )
		{
			vetor[i] = 1 + (int)(Math.random()*100);
		}

		// Mostra os valores novamente.
		System.out.print("vetor contem: ");
		for ( i=0 ; i < vetor.length ; i++ )
		{
			System.out.print( vetor[i] + " ");
		}
		System.out.println();
	}
}