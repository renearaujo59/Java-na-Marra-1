package javanamarra;

import java.util.Scanner;

public class ControleAcesso
{
	public static void main( String [] args )
	{
		int idade = 22 ;
		boolean naListadeConvidados = false ;
		double atratividade = 7.5 ;
		String sexo = "F" ;
		
		if ( naListadeConvidados || idade >= 21 || (sexo.equals("F") && atratividade >=8 ) )
		{
			System.out.println("Voce pode entrar na boate.");
		}
		else
		{
			System.out.println("Voce não pode entrar na boate.");
		}
	}
}	