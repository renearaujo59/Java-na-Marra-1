package javanamarra;

import java.util.Scanner;

public class JogoDoPorcoComputador
{
	public static void main (String[ ] args)
	{
		Scanner teclado = new Scanner(System.in);

		int rolada, total;

		total = 0;

		do
		{
			rolada = 1 + (int)(Math.random( )*6);
			System.out.println("Computador rolou um " + rolada + " .");
			if (rolada == 1)
			{
				System.out.println("\tEsse é o fim do turno de l e.");
				total = 0;
			}
			else
			{
				total += rolada;
				System.out.println("\tO Computador tem " + total + " pontos nessa rodada.");
				if (total < 20)
				{
					System.out.println("\tComputador escolhe rolar novamente.");
				}
			}
		} while (rolada != 1 && total < 20);

			System.out.println("Computador terminou a rodada com " + total + " pontos.");

	}
}