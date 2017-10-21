package javanamarra;

public class NumerosAleatorios
{
	public static void main( String [] args )
	{
		int a, b, c;
		double x, y, z;
		
		x = Math.random();
		y = Math.random();
		z = Math.random();
		
		System.out.println( "x e " + x );
		System.out.println( "y e " + y );
		System.out.println( "z e " + z );
		
		x = Math.random() * 100;
		y = Math.random() * 100;
		z = Math.random() * 100;
		
		System.out.println( "\nx e " + x);
		System.out.println( "y e " + y );
		System.out.println( "z e " + z );
		
		a = (int)x;
		b = (int)y;
		c = (int)z;
		
		System.out.println( "\nx e " + a );
		System.out.println( "a e " + a);
		
		x = Math.random();
		a = 0 + (int) (x*10);
		b = 1 + (int) (x*10);
		c = 5 + (int) (x*10);
		
		System.out.println( "\na e " + a);
		System.out.println( "b e " + b);
		System.out.println( "c e " + c);
	}
}