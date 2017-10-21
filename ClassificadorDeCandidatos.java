package javanamarra;

import java.util.Scanner;
import static java.lang.System.*;

public class ClassificadorDeCandidatos
{
	public static void main(String [] args )
	{
		Scanner teclado = new Scanner(System.in);
		int nota;
		
		out.println( "Bem vindo ao programa de Classificacao de Universidades Nacionais!" );
		out.print( "Digite o numero de pontos arredondado da sua prova (0-1000):" );
		nota=teclado.nextInt();
		
		out.print("A chance de voce ser admitido e: " );
		
		if ( nota >= 800 )
			out.print("CERTA ");
		else if ( nota >= 700 )
			out.print("QUASE CERTA ");
		else if ( nota >= 650 )
			out.print("POSSIVEL ");
		else if  ( nota >= 570 )
			out.print("INCERTA " );
		else if ( nota >= 450)
			out.print("POUCO PROVAVEL" );
		else if	( nota < 449 )
			out.print("NENHUMA");
		
		out.println();
	}
}	
	