package javanamarra;

import java.io.FileWriter;
import java.io.PrintWriter;

public class CartaParaVoceRevisitada
{
	public static void main(String[] args) throws Exception
	{
		PrintWriter arquivoDeSaida;

		arquivoDeSaida = new PrintWriter( new FileWriter("carta.txt") );

		arquivoDeSaida.println( "+--------------------------------------------------+" );
		arquivoDeSaida.println( "|                                             #### |" );
		arquivoDeSaida.println( "|                                             #### |" );
		arquivoDeSaida.println( "|                                             #### |" );
		arquivoDeSaida.println( "|                                                  |" );
		arquivoDeSaida.println( "|                                                  |" );
		arquivoDeSaida.println( "|                         Bill Gates               |" );
		arquivoDeSaida.println( "|                         1 Microsoft Way          |" );
		arquivoDeSaida.println( "|                         Redmond, WA 98104        |" );
		arquivoDeSaida.println( "|                                                  |" );
		arquivoDeSaida.println( "+--------------------------------------------------+" );
		arquivoDeSaida.close();
	}
}