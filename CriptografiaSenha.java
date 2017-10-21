package javanamarra;

import java.util.Scanner;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

public class CriptografiaSenha
{
	public static void main ( String[] args ) throws Exception
	{
		Scanner teclado = new Scanner(System.in);

		String senha, hash;

		MessageDigest criptografia = MessageDigest.getInstance("SHA-256");

		System.out.print("Senha: ");
		senha = teclado.nextLine();

		criptografia.update( senha.getBytes("UTF-8") );
		hash = DatatypeConverter.printHexBinary( criptografia.digest() );

		System.out.println( hash );
	}
}