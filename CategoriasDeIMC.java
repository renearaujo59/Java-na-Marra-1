package javanamarra;

import java.util.Scanner;

public class CategoriasDeIMC
{
	public static void main(String [] args )
	{
		Scanner teclado = new Scanner(System.in);
		
		double imc ; // faça o desafio do exercicio
		
		System.out.println("Entre seu IMC: ") ;
		imc = teclado.nextDouble();
		
		System.out.print( "Categoria de IMC: ");
		if (imc < 15.0 )
		{
			System.out.println("sobpeso muito severo");
		}
		else if ( imc <= 16.0)
		{
			System.out.println("Severo sobpeso");
		}
		else if ( imc < 18.5 )
		{
			System.out.println("Sobpeso");
		}
		else if ( imc < 25.0)
		{
			System.out.println( "Peso normal " );
		}
		else if ( imc < 30.0 )
		{
			System.out.println("Sobrepeso" );
		}
		else if ( imc < 35.0 )
		{
			System.out.println("Obesidade moderada");
		}
		else if ( imc < 40.0 )
		{
			System.out.println("Obesidade severa");
		}
		else
		{
			System.out.println("Obesidade muito severa \"morbida\"" );
		}
	}
}	