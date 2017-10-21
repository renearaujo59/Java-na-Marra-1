package javanamarra;

import java.util.Scanner;
public class OrdemAlfabetica
{
	public static void main(String [] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Invente um nome de uma linguagem de programacao: ");
		nome = teclado.nextLine();
		
		if ( nome.compareTo("c++") < 0 )
			System.out.println( nome + " vem ANTES de c++");
		if ( nome.compareTo("c++") == 0 )
			System.out.println(" c++ nao e uma linguagem inventada por voce!");
		if ( nome.compareTo("c++") > 0 )
			System.out.println( nome + " vem DEPOIS de c++");
		
		if ( nome.compareTo("go") < 0 )
			System.out.println( nome + " vem ANTES de go");
		if ( nome.compareTo("go") == 0 )
			System.out.println(" go nao e uma linguagem inventada por voce!");
		if ( nome.compareTo("go") > 0 )
			System.out.println( nome + " vem DEPOIS de go");
		
		if ( nome.compareTo("java") < 0 )
			System.out.println( nome + " vem ANTES de java");
		if ( nome.compareTo("java") == 0 )
			System.out.println(" java nao e uma linguagem inventada por voce!");
		if ( nome.compareTo("java") > 0 )
			System.out.println( nome + " vem DEPOIS de java");
		
		if ( nome.compareTo("lisp") < 0 )
			System.out.println( nome + " vem ANTES de lisp");
		if ( nome.compareTo("lisp") == 0 )
			System.out.println(" lisp nao e uma linguagem inventada por voce!");
		if ( nome.compareTo("lisp") > 0 )
			System.out.println( nome + " vem DEPOIS de lisp");
		
		if ( nome.compareTo("python") < 0 )
			System.out.println( nome + " vem ANTES de python");
		if ( nome.compareTo("python") == 0 )
			System.out.println(" python nao e uma linguagem inventada por voce!");
		if ( nome.compareTo("python") > 0 )
			System.out.println( nome + " vem DEPOIS de python");
		
		if ( nome.compareTo("ruby") < 0 )
			System.out.println( nome + " vem ANTES de ruby");
		if ( nome.compareTo("ruby") == 0 )
			System.out.println(" ruby nao e uma linguagem inventada por voce!");
		if ( nome.compareTo("ruby") > 0 )
			System.out.println( nome + " vem DEPOIS de ruby");
		
		if ( nome.compareTo("visualbasic") < 0 )
			System.out.println( nome + " vem ANTES de visualbasic");
		if ( nome.compareTo("visualbasic") == 0 )
			System.out.println(" visualbasic nao e uma linguagem inventada por voce!");
		if ( nome.compareTo("visualbasic") > 0 )
			System.out.println( nome + " vem DEPOIS de visualbasic");
	}
}