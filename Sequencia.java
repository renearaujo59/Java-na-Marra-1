package javanamarra;

import java.util.Scanner ;

public class Sequencia
{
	public static void main( String [] args )
	{
	 //COM ERRO
	 
		Scanner teclado = new Scanner(System.in ) ;
		double preco, imposto , total ;
		
		System.out.print("Qual e o preço de compra? ") ;
		preco=teclado.nextDouble() ;
		
		imposto = preco * 0.0825;
		total = preco + imposto ;
		
		System.out.println("Preço do item:\t R$" + preco ) ;
		System.out.println("Imposto:\t R$" + imposto ) ;
		System.out.println("Custo total:\t R$ " + total ) ;
	}
}