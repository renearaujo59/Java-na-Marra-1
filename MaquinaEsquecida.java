package javanamarra;

import java.util.Scanner ;

public class MaquinaEsquecida
{
	public static void main( String [] args )
	{
	
		Scanner teclado = new Scanner(System.in) ;
		
		System.out.println("Qual e a capital da França?" ) ;
		teclado.next();
		
		System.out.println("Quanto e 6 multiplicado por 7?" ) ;
		teclado.nextInt () ;
		
		System.out.println("Qual e o seu numero favorito entre 0.0 e 1.0?" );
		teclado.nextDouble() ;
		
		System.out.println( "Existe mais alguma coisa que voce gostaria de me dizer?") ;
		teclado.next();
	}
}