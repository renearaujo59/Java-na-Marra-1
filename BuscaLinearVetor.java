package javanamarra;

import java.util.Scanner;

public class BuscaLinearVetor
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);

		int[] numerosDePedidos = {12345, 54321, 78753, 101010, 8675309, 31415, 271828};
		int aEncontrar;

		System.out.println("Existem " + numerosDePedidos.length + " pedidos no cadastro.");

		System.out.print("Pedidos: ");
		for (int num : numerosDePedidos)
		{
			System.out.print(num +" " );
		}
		System.out.println();

		System.out.print("Qual pedido quer encontrar'?");
		aEncontrar = teclado.nextInt();

		for (int num : numerosDePedidos)
		{
			if ( num == aEncontrar)
			{
				System.out.println(num + " Encontrado.");
			}
		}
	}
}