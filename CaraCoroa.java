package javanamarra;

import java.util.Scanner;

public class CaraCoroa
{
	public static void main( String [] args )
	{
		Scanner teclado = new Scanner(System.in);
		
		String moeda, novamente;
		int lancamento, repeticao = 0;
		
		do{
			lancamento = 1 + (int) (Math.random()*2);
			
			if ( lancamento ==1 )
				moeda = "CARA";
			else
				moeda = "COROA";
			
			System.out.println( "Voce jogou a moeda e deu... " + moeda );
			
			if ( lancamento == 1)
			{
				repeticao++;
				System.out.println( "\tEssa eh a " + repeticao + "a repitcao!");
				System.out.println( "\tGostaria de jogar a moeda novamente? (s/n)?" );
				novamente = teclado.next();
			}
			else{
				repeticao = 0;
				novamente = "n";
			}
		}
		while ( novamente.equals("s"));
		
		System.out.println( "Placar final: " + repeticao );
		
	}
}