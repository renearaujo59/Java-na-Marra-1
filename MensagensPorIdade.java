package javanamarra;

import java.util.Scanner;

public class MensagensPorIdade
{
	public static void main( String [] args )
	{
		Scanner teclado = new Scanner(System.in) ;
		
		int idade ;
		
		System.out.print("Qual a sua idade? ") ;
		idade= teclado.nextInt();
		
		if ( idade < 13 )
		{
		System.out.println("Voce e jovem demais para ter uma conta no Facebook.") ;
		}
		if (idade > 13 )
		{
		System.out.println("Voce ja pode ter conta no facebook.");
		}
		if (idade > 16)
		{
		System.out.println("Voce ja pode votar.");
		}
		if ( idade < 16 )
		{
		System.out.println("Voce e jovem demais para votar.");
		}
		if (idade > 18 )
		{
		System.out.println("Voce ja pode tirar carteira de motorista.");
		}
		if (idade < 18 )
		{
		System.out.println("Voce e jovem demais para ter carteira de motorista.");
		}
		if (idade > 35)
		{
		System.out.println("Voce pode concorrer ha presidencia.");
		}
		if (idade < 35)
		{
		System.out.println("Voce e jovem demais para concorrer para presidente do pais.");
		}
		if (idade < 65)
		{
		System.out.println("Voce e jovem demais para aposentar.");
		}
		if (idade> 65)
		{
		System.out.println("Voce ja pode se aposentar.");
		}
		System.out.println("Que triste!!" ) ;
		}
	}