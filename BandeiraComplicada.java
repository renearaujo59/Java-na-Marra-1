package javanamarra;

import static java.lang.System.*;

public class BandeiraComplicada
{
	public static void main(String[] args)
	{
		imprimeMetadeDeCima();

		imprime48DoisPontos();
		imprime48Os();
		imprime48DoisPontos();
		imprime48Os();
		imprime48DoisPontos();
		imprime48Os();
	}

	public static void imprime48DoisPontos()
	{
		out.println( "|::::::::::::::::::::::::::::::::::::::::::::::::|" );
	}

	public static void imprime48Os()
	{
		out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
	}

	public static void imprime29DoisPontos()
	{
		out.println( "|::::::::::::::::::::::::::::::::::|" );
	}

	public static void imprimeSaudacao()
	{
		out.println("Eu saudo a bandeira!");
	}

	public static void imprime29Os()
	{
		out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
	}

	public static void imprime6Estrelas()
	{
		out.print( "| * * * * * * " );
	}

	public static void imprime5Estrelas()
	{
		out.print( "|  * * * * *  " ) ;
	}

	public static void imprimeLinhaDeSeisEstrelas()	
	{
		imprime6Estrelas();
		imprime29Os () ;
	}

	public static void imprimeLinhaDeCincoEstrelas()
	{
		imprime5Estrelas();
		imprime29DoisPontos() ;
	}

	public static void imprimeMetadeDeCima()
	{
		out.println( " ________________________________________________" ); // 1 espaco e 48 underscores
		imprimeLinhaDeSeisEstrelas();
		imprimeLinhaDeCincoEstrelas();
		imprimeLinhaDeSeisEstrelas();
		imprimeLinhaDeCincoEstrelas();
		imprimeLinhaDeSeisEstrelas();
		imprimeLinhaDeCincoEstrelas();
		imprimeLinhaDeSeisEstrelas();
	}
}