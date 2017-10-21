package javanamarra;

import java.util.Scanner;

public class PronomesDeTratamento
{
	public static void main(String[] args )
	{
		Scanner teclado = new Scanner(System.in);
		
		String titulo;
		
		System.out.print("Primeiro nome: ");
		String primeiro = teclado.next();
		System.out.print("Ultimo nome: ");
		String ultimo = teclado.next();
		System.out.print("Sexo (M/F): ");
		String sexo = teclado.next ();
		System.out.print("Idade: ");
		int idade = teclado.nextInt();
		
		if (idade < 20)
		{
			titulo= primeiro;
		}
		else
		{
			if ( sexo.equals("F") )
			{
				System.out.print("Voce e casada, "+primeiro+"? (S/N): ");
				String casada = teclado.next();
				if (casada.equals("S"))
				{
					titulo="Sra.";
				}
				else
				{
					titulo="Srta.";
				}
			}
			else	
			{
				titulo="Sr.";
			}
		}
		
		System.out.println("\n" + titulo + " "+ultimo);
		
	}
}	