package javanamarra;

import java.util.Scanner ;

public class QuestoesIndelicadas
{
	public static void main( String [] args )
	{
		String nome;
		int idade;
		double peso , salario ;
		
		Scanner teclado = new Scanner(System.in) ;
		
		System.out.println("Ola. Qual seu nome? " );
		nome=teclado.next();
		
		System.out.println("Ola," + nome + "! Qual a sua idade?" );
		idade=teclado.nextInt();
		
		System.out.println("Entao voce tem " + idade +  " Anos, hein? Voce nao e velho." ) ;
		System.out.print("Quanto voce pesa," + nome + "?" );
		peso=teclado.nextDouble();
		
		System.out.print(peso + "kg! Melhor nao contar para ninguem. Finalmente, qual o seu salario " + nome + "?" ) ;
		salario = teclado.nextDouble();
		
		System.out.println("Espero que sejam R$" + salario + " por hora e nao por mes!" );
		System.out.println("Bem , obrigado por responder essas questoes indelicadas," + nome + ".");
	}	
}	