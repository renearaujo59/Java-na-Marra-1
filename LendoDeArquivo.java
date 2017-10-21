package javanamarra;

import java.util.Scanner;
import java.io.File;

public class LendoDeArquivo
{
	public static void main(String[] args) throws Exception
	{
		Scanner arquivoEntrada = new Scanner(new File("nome-e-numeros.txt"));

		int a, b, c, soma;
		String nome;

		System.out.print("Lendo nome e tres numeros do arquivo...");
		nome = arquivoEntrada.nextLine();
		a = arquivoEntrada.nextInt();
		b = arquivoEntrada.nextInt();
		c = arquivoEntrada.nextInt();
		arquivoEntrada.close();

		System.out.println("pronto.");
		System.out.println("Seu nome eh: " + nome);
		soma = a + b + c;
		System.out.println( a + "+" + b + "+" + c + " = " + soma );
	}
}