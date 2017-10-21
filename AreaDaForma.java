package javanamarra;

import java.util.Scanner;

public class AreaDaForma
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);

		int opcao;
		double area = 0;

		System.out.println("Calculadora de área de forma versão 0.1. Saída Exemplo.");

		do
		{
			System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			System.out.println("1) Triângulo");
			System.out.println("2) Círculo");
			System.out.println("3) Retângulo");
			System.out.println("4) Sair");
			System.out.print(">");
			opcao = teclado.nextInt();

			if ( opcao == 1 )
			{
				System.out.print("\nBase: ");
				int b = teclado.nextInt();
				System.out.print("Altura: ");
				int h = teclado.nextInt();
				area = calculeAreaTriangulo(b, h);
				System.out.println("A area é " + area);
			}
			else if ( opcao == 2 )
			{
				System.out.print("\nRaio: ");
				int r = teclado.nextInt();
				area = calculeAreaCirculo(r);
				System.out.println("A area é " + area);
			}
			else if ( opcao == 3 )
			{
				System.out.print("\nComprimento: ");
				int comprimento = teclado.nextInt();
				System.out.print("Largura: ");
				int largura = teclado.nextInt();
				System.out.println("A area é " + calculeAreaRetangulo(comprimento, largura) );
			}
			else if ( opcao != 4 )
			{
			System.out.println("ERRO.");
			}

		} while ( opcao != 4 );

	}

	public static double calculeAreaTriangulo(int base, int altura)
	{
		double A;
		A = 0.5 * base * altura;
		return A;
	}

	public static double calculeAreaCirculo(int raio)
	{
		double A;
		A = Math.PI * raio * raio;
		return A;
	}

	public static int calculeAreaRetangulo(int comprimento, int largura)
	{
		return (comprimento * largura);
	}
}