package javanamarra;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CaraCoroaSalvo
{
	public static void main(String[] args) throws Exception
	{
		Scanner teclado = new Scanner(System.in);

		String moeda, novamente, recordeNome, arquivo = "cara-coroa-recorde.txt";
		int lancamento, repeticao = 0, recorde;

		File in = new File(arquivo);
		if ( in.createNewFile() )
		{
			System.out.println("Arquivo de recordes nao existia. Criado.");
			recorde = -1;
			recordeNome = "";
		}
		else
		{
			Scanner entrada = new Scanner(in);
			recordeNome = entrada.next();
			recorde = entrada.nextInt();
			entrada.close();
			System.out.println("O recorde a tual eh " + recorde + " lancamentos seguidos, por " + recordeNome );
		}


		do
		{
			lancamento = 1 + (int)(Math.random()*2);

			if ( lancamento == 1 )
				moeda = "CARA";
			else
				moeda = "COROA";

			System.out.println( "Voce lancou a moeda e deu... " + moeda );

			if ( lancamento == 1 )
			{
				repeticao++;
				System.out.println( "\tEssa eh a " + repeticao + "a seguida...." );
				System.out.print( "\tGostaria de tentar novamente (s/n)? " );
				novamente = teclado.next();
			}
			else
			{
				repeticao = 0;
				novamente = "n";
			}

		} while ( novamente.equals("s") );

		System.out.println( "Placar final: " + repeticao );

		if ( repeticao > recorde )
		{
			System.out.println("Esse eh um novo recorde'!");
			System.out.print("Escreva seu nome: ");
			recordeNome = teclado.next();
			recorde = repeticao;
		}
		else if ( repeticao == recorde )
		{
			System.out.println("Voce igualou o recorde. Legal.");
		}
		else
		{
			System.out.println("Voce precisa fazer mais que " + repeticao + " sequiser estabelecer um recorde.");
		}

		// Salva o nome e o recorde em arquivo'
		PrintWriter out = new PrintWriter(new FileWriter(arquivo) );
		out.println(recordeNome);
		out.println(recorde);
		out.close();
	}
}