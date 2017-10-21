package javanamarra;

import java.util.Scanner;

public class CalculadoraIMC
{
	public static void main( String [] args)
	{
		Scanner teclado = new Scanner(System.in);
		double cm,g,kg,imc ;
		
		System.out.print( "Sua altura em cm: " ) ;
		cm = teclado.nextDouble() ;
		
		System.out.print( "Seu peso em g: " ) ;
		g = teclado.nextDouble () ;
		
		imc= g*1000 / (cm*cm*100) ;
		
		System.out.println("Seu IMC e " + imc) ;
	}
}