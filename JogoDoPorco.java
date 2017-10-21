package javanamarra;

import java.util.Scanner;

public class JogoDoPorco
{
	public static void main (String[] args)
	{
		Scanner teclado = new Scanner(System.in);

		int rolada, total1, total2, totalRodada;
		String choice = "";

		total1 = 0;
		total2 = 0;

		do
		{
			totalRodada = 0;
			System.out.println("Você tem " + total1 + " pontos.");

			do
			{
				rolada = 1 + (int)(Math.random()*6);
				System.out.println("\tVocê rolou um " + rolada + ".");
				if (rolada == 1)
				{
					System.out.println("\tIsso encerra sua rodada.");
					totalRodada = 0;
				}
				else
				{
					totalRodada += rolada;
					System.out.println("\tVocê tem " + totalRodada + " pontos até agora nesta rodada.");
					System.out.print("\tVocê gostaria de \" rolar\" novamente ou \"parar\"?");
					choice = teclado.next();
				}
			} while (rolada != 1 && choice.equals("rolar"));

			total1 += totalRodada;
			System.out.println("\tVocê terminou essa rodada com " + total1 + " pontos.");

			if (total1 < 100)
			{
				totalRodada = 0;
				System.out.println("O computador tem " + total2 + " pontos.");

				do
				{
					rolada = 1 + (int)(Math.random()*6);

					System.out.println("\tComputador rolou um " + rolada + ".");
					if (rolada == 1)
					{
						System.out.println("\tIsso encerra a rodada dele.");
						totalRodada = 0;
					}
					else
					{
						totalRodada += rolada;
						System.out.println("\tComputador tem " + totalRodada + " pontos até agora nessa rodada.");
						if (totalRodada < 20)
						{
						System.out.println("\tComputador escolhe rolar novamente.");
						}
					}
				} while (rolada != 1 && totalRodada < 20);

				total2 += totalRodada;
				System.out.println("\tComputador terminou a rodada com " + total2 + " pontos.");
			}

		} while (total1 < 100 && total2 < 100);

		if (total1 > total2)
		{
			System.out.println("Humanidade venceu!");
		}
		else
		{
			System.out.println("O computador venceu.");
		}

	}
}