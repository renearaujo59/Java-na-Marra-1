package javanamarra;

import java.util.Scanner;

public class ItemNaoEncontrado
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner ( System.in );

		String[] herois = {
			"Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon",
			"Belle rophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
			"Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
			"Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus" };
		String resposta;
		boolean encontrado;

		System.out.print( "Pop Quiz! Cite o nome de um heroi mortal da mitologia grega: " );
		resposta = teclado.next();

		encontrado = false;
		for ( String heroi : herois )
		{
			if ( resposta.equals( heroi) )
			{
				System.out.println( "Correto!" );
				encontrado = true;
			}
		}

		if ( encontrado == false )
		{
			System.out.println( "Nao, " + resposta + " nao foi um heroi mortal grego." );
		}
	}
}