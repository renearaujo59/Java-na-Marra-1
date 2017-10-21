package javanamarra;

import java.util.Scanner;

public class AvoMaterialista
{
	public static void main( String [] args )
	{
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		double salario,beleza;
		boolean permitido;
		
		System.out.print("Informe a sua idade: ");
		idade = teclado.nextInt();
		
		System.out.print("Informe seu salario mensal: ");
		salario = teclado.nextDouble() ;
		
		System.out.print("Qual seria a sua nota de beleza em uma escala de 0.0 a 10.0?" ) ;
		beleza = teclado.nextDouble() ;
		
		permitido = (idade > 25 && idade < 40 && (salario > 10000 || beleza >= 8.5) ) ;
		
		System.out.println("Voce pode namorar minha neta: " + permitido );
	}
}	