package javanamarra;

import java.util.Scanner;

public class Senha
{
	public static void main(String [] args )
	{
		Scanner teclado = new Scanner(System.in) ;
		
		String senha = "porfavor", palpite ;
		
		System.out.println("Qual e a senha? " );
		palpite = teclado.next();
		
		if (palpite == senha)
		{
			System.out.println("Impossivel.(Esta linha nunca sera impressa .)") ;
		}
		
		if ( palpite.equals(senha) )
		{
			System.out.println("Esta certo! " ) ;
		}
		else
		{
		System.out.println("Nao,a senha nao e \"" + palpite + "\"." ) ;
		}
	}
}	