package javanamarra;

import java.util.Scanner;

public class TentePalpites
{
	public static void main( String [] args){

		Scanner teclado = new Scanner(System.in);
		int segredo, palpite;
		
		segredo = 1 + (int) (Math.random()*10);
		
		System.out.println("Escolhi um numero entre 1 e 10. Tente Adivinha-lo.");
		System.out.print( "Seu palpite: " );
		palpite = teclado.nextInt();
		
		while ( segredo != palpite )
		{
			System.out.println( "nao e um bom palpite. Tente novamente. ");
			System.out.print( "Seu palpite: " );
		}
		System.out.println( "Muito bem! Voce e um adivinhao." );
	}
}