package javanamarra;

import java.util.Scanner;

public class ComparandoNumeros
{
	public static void main( String [] args )
	{
		Scanner teclado = new Scanner(System.in);
		double primeiro , segundo ;
		
		System.out.print("Digite dois numeros. Primeiro: ");
		primeiro = teclado.nextDouble() ;
		System.out.print("Segundo: ");
		segundo = teclado.nextDouble() ;
		
		if ( primeiro < segundo)
		{
		System.out.println( primeiro + " e MENOR QUE " + segundo ) ;
		}
		if ( primeiro <= segundo )
		{
		System.out.println( primeiro + " e MENOR QUE ou IGUAL A " + segundo ) ;
		}
		if ( primeiro == segundo )
		{
		System.out.println( primeiro + " e IGUAL A " + segundo ) ;
		}
		if ( primeiro >= segundo )
		{
		System.out.println( primeiro + " e MAIOR QUE ou IGUAL A " + segundo ) ;
		}
		if ( primeiro > segundo )
		{
		System.out.println( primeiro + " e MAIOR QUE " + segundo ) ;
		}
		
		if (primeiro != segundo)
		{
			System.out.println( primeiro + " NAO EH IGUAL A " + segundo ) ;
			System.out.println("Ola!!");
		}
			
	}
}	