package javanamarra;

import java.util.Scanner;
public class DigiteASenha
{
	public static void main( String [] args)
	{
		Scanner teclado = new Scanner(System.in);
		int senha, entrada;
		
		senha = 12345;
		
		System.out.println("BEMVINDO AO BANCO DO JAVA.");
		System.out.print("DIGITE SUA SENHA: ");
		entrada = teclado.nextInt();
		
		while ( entrada != senha )
		{
			System.out.println("\nSenha INCORRETA. TENTE NOVAMENTE.");
			System.out.print("DIGITE SUA SENHA: ");
			entrada =  teclado.nextInt();
		}
		
		System.out.println("\nSENHA CORRETA. AGORA VOCE TEM ACESSO A SUA CONTA");
	}
}