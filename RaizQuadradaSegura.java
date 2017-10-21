package javanamarra;

import java.util.Scanner;

public class RaizQuadradaSegura
{
	public static void main( String [] args )
	{
		Scanner teclado = new Scanner(System.in);
		double x, y;
		
		System.out.print("Informe um numero real e eu lhe direi qual a raiz quadrada dele. ");
		System.out.print("(Nada de informar numeros negativos, por gentileza.) ");
		x = teclado.nextDouble();
		
		while ( x < 0 )
		{
			System.out.print("Desculpe, mas nao posso calcular a raiz quadrada real de um numero negativo. \nNovo numero: ");
			x = teclado.nextDouble();
		}
		 
		y = Math.sqrt(x);
		System.out.println("A raiz quadrada de " + x +" e " + y);
	}
}