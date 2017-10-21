package javanamarra;

import java.util.Scanner;

public class TotalGeral
{
	public static void main (String[ ] args)
	{
		Scanner teclado = new Scanner(System.in);

		int atual, total = 0;

		System.out.print("Digite um monte de valores para que eu os some.");
		System.out.println("Vou parar quando você digitar zero.");

		do
		{	
			System.out.print("Valor: ");
			atual = teclado.nextInt( );
			int novoTotal = atual + total;
			total = novoTotal;
			System.out.println("O total até agora é: " + total);
		} while (atual != 0);

		System.out.println("O total final é " + total);
	}
}