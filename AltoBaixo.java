package javanamarra;

import java.util.Scanner;

public class AltoBaixo
{
	public static void main( String [] args )
	{
		Scanner teclado = new Scanner(System.in);
		int segredo, palpite;
		
		segredo = 1 + (int) (Math.random()*100);
		
		System.out.println( "Estou pensando em um numero entre 1 e 100. Tente adivinhar.");
		System.out.print("> ");
		palpite = teclado.nextInt();
		
		while ( segredo != palpite )
		{
			if (palpite < segredo)
			{
				System.out.println( "Desculpe. Seu palpite foi muito baixo. Tente novamente.");
			}
			if (palpite > segredo){
				System.out.println( "Desculpe. Seu palpite foi muito alto. Tente novamente." );
			}
			System.out.print( "> " );
			palpite = teclado.nextInt();
		}
		
		System.out.println( "Voce acertou! Qual a chance ?!?" );
	}
}