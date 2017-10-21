package javanamarra;

public class LacosAninhados
{
	public static void main(String[] args )
	{
		// Esse eh o #1 - vou chama-lo "CN"
		for ( char c='A'; c <= 'E'; c++)
		{
			for ( int n=1; n <= 3 ; n++)
			{
				System.out.println( c + " " + n );
			}
		}

		System.out.println("\n");

		// Esse eh o #2 - vou chama-lo "AB"
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++)
			{
				System.out.print( "(" + a + "," + b + ") " );
			}
			// * Voce vai adicionar uma linha de codigo aqui
		}

		System.out.println("\n");

	}
}