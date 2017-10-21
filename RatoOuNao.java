package javanamarra;

import java.util.Scanner;

public class RatoOuNao
{
	public static void main( String [] args )
	{
		Scanner teclado = new Scanner(System.in);
		
		String palavra ;
		boolean claro , nem ;
		
		System.out.println( "Digite a palavra \"rato\",por favor." ) ;
		palavra = teclado.next() ;
		
		claro = palavra.equals("rato") ;
		nem = ! palavra.equals("rato") ;
		
		System.out.println("Voce digitou o que foi pedido: " + claro ) ;
		System.out.println("Voce ignorou uma instrucao cheia de cortesia: " + nem) ;
	}
}
		