package javanamarra;

import java.util.Scanner;

public class CifraDeCesar
{
/**
	* Returns the character deslocamentoed by the given number of letters.
	*/
	public static char letraDeslocada( char c, int n)
	{
		int ch = c;

		if ( ! Character.isLetter(c) )
		return c;

		ch = ch + n;
		if ( Character.isUpperCase(c) && ch > 'Z' || Character.isLowerCase(c) && ch > 'z' )
		ch -= 26;
		if ( Character.isUpperCase(c) && ch < 'A' || Character.isLowerCase(c) && ch < 'a' )
		ch += 26;

	return (char)ch;
	}

	public static void main( String[] args )
	{
		Scanner teclado = new Scanner(System.in);
		String textoOriginal, textoCifrado = "";
		int deslocamento;

		System.out.print("Mensagem: ");
		textoOriginal = teclado.nextLine();
		System.out.print("Deslocamento (0-26): ");
		deslocamento = teclado.nextInt();

		for (int i=0; i<textoOriginal.length(); i++)
		{
			textoCifrado += letraDeslocada( textoOriginal.charAt(i), deslocamento );
		}
		System.out.println( textoCifrado );

	}
}