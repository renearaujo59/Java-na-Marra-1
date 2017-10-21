package javanamarra;

import java.util.Scanner;

public class ExpressoesBooleanas
{
	public static void main( String [] args )
	{
		Scanner teclado = new Scanner (System.in) ;
		
		boolean a, b, c, d, e, f;
		double x,y;
		
		System.out.print("De-me dois numeros. Primeiro: " );
		x = teclado.nextDouble() ;
		System.out.print( "Segundo: ");
		y = teclado.nextDouble() ;
		
		a = (x <  y) ;
		b = (x <= y) ;
		c = (x == y) ;
		d = (x != y) ;
		e = (x >  y) ;
		f = (x >= y) ;
		
		System.out.println( x + " e MENOR QUE " + y + ": " + a) ;
		System.out.println( x + " e Menor QUE ou IGUAL A " + y + ": " + b ) ;
		System.out.println( x + " e IGUAL A " + y + ": " + c ) ;
		System.out.println( x + " Nao e IGUAL A " + y + ": " + d ) ;
		System.out.println( x + " e MAIOR QUE " + y + ": " + e ) ;
		System.out.println( x + " e MAIOR QUE ou IGUAL A " + y + ": " + f ) ;
		System.out.println() ;
		
		System.out.println( !(x < y) + " " + (x >= y) ) ;
		System.out.println( !(x <= y) + " " + (x > y) ) ;
		System.out.println( !(x == y) + " " + (x != y) ) ;
		System.out.println( !(x != y) + " " + (x == y) ) ;
		System.out.println( !(x > y) + " "  + (x <= y) ) ;
		System.out.println( !(x >= y) + " " + (x < y) ) ;
		
	}
}