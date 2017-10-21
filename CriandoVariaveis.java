package javanamarra;

public class CriandoVariaveis
{
	public static void main( String [] args )
	{
		int x,y, idade ;
		double segundos, e, saldo ;
		String primeiroNome, ultimo_nome, titulo ;
		
		x = 10 ;
		y = 400;
		idade = 39 ;
		
		segundos = 4.71 ;
		e = 2.71828182845904523536 ;
		saldo = 1.89 ;
		
		primeiroNome = "Asdrubal" ;
		ultimo_nome = " Teixeira " ;
		titulo = "Sr. " ;
		
		System.out.println( "A variavel x contem" + x ) ;
		System.out.println( "O valor " + y + " esta guardado na variavel y .") ;
		System.out.println( "O experimento executou em " + segundos + "segundos.") ;
		System.out.println( "Meu numero irracional favorito e a constante de Euler: " + e ) ;
		System.out.println( "Gracas a Deus meu saldo e mais de R$" + saldo + "!" ) ;
		System.out.println( "Meu nome completo e " + titulo + " " + primeiroNome + ultimo_nome ) ;
		}
	}	