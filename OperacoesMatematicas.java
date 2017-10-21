package javanamarra;

public class OperacoesMatematicas
{
	public static void main( String [] args )
	{
		int a,b,c,d,e,f,g;
		double x,y,z;
		String um,dois,ambos;
		
		a = 10 ;
		b = 27 ;
		
		System.out.println( "a e " + a +" , b e " + b ) ;
		
		c = a + b ;
		System.out.println( "a+b e" + c);
		d = a - b ;
		System.out.println( "a-b e" + d);
		e = a+b*3;
		System.out.println( "a+b*3 e " + e);
		f = b / 2 ;
		System.out.println("b/2 e " + f) ;
		g= b % 10;
		System.out.println("b%10 e " +g) ;
		
		x = 1.1;
		System.out.println( "\nx e" + x) ;
		y = x*x;
		System.out.println( "x*x e" + y) ;
		z = b/2 ;
		System.out.println( "b/2 e " + z) ;
		System.out.println() ;
		
		um = "cachorro" ;
		dois = "quente" ;
		ambos = um + dois ;
		System.out.println( ambos );
	}
}