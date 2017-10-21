package javanamarra;

import java.util.Scanner;

/**
* Contem funções que tornam mais fácil trabalhar com meses
*/
public class TrintaDiasComFuncoes
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);

		System.out.print( "Qual mês? (1-12) " );
		int mes = teclado.nextInt();

		System.out.println( "O mês de " + nomeDoMes(mes) + " tem " + diasNoMes(mes) + " dias." );

	}

	/**
	* Retorna o nome correspondente ao número do mês (1-12).
	*
	* @author Graham Mitchell
	* @param mes o número do mês (1-12)
	* @return uma String contendo o nome em Português para um mês dado, ou "erro" se o
	mês está fora do intervalo
	*/
	public static String nomeDoMes ( int mes )
	{
		String nomeDoMes = "erro";

		if ( mes == 1 )
			nomeDoMes = "Janeiro";
		else if ( mes == 2 )
			nomeDoMes = "Fevereiro";
		else if ( mes == 3 )
			nomeDoMes = "Março";
		else if ( mes == 4 )
			nomeDoMes = "Abril";
		else if ( mes == 5 )
			nomeDoMes = "Maio";
		else if ( mes == 6 )
			nomeDoMes = "Junho";
		else if ( mes == 7 )
			nomeDoMes = "Julho";
		else if ( mes == 8 )
			nomeDoMes = "Agosto";
		else if ( mes == 9 )
			nomeDoMes = "Setembro";
		else if ( mes == 10 )
			nomeDoMes = "Outubro";
		else if ( mes == 11 )
			nomeDoMes = "Novembro";
		else if ( mes == 12 )
			nomeDoMes = "Dezembro";

		return nomeDoMes;
	}

	/**
	* Retorna o número de dias de um mês dado
	*
	* @author Graham Mitchell
	* @param mes o número cor respondente ao mês (1-12)
	* @return o número de dias em um ano não bissexto para aquele mês, oou 31 se o mês
	for fora do intervalo
	*/
	public static int diasNoMes( int mes )
	{
		int dias;

		/* Tem trinta dias setembro    Thirty days hath September
		Abril, junho e novembro        April, June and November
		Tem trinta e um todo o resto   All the rest have thirty one
		O segundo mês exceto        Except the second month alone.... */

		switch (mes)
		{
			case 9:
			case 4:
			case 6:
			case 11: dias = 30;
			break;
			case 2: dias = 28;
			break;
			default: dias = 31;
		}

		return dias;
	}
}