package javanamarra;

public class NumerosAleatorios2
{
	public static void main( String[] args )
	{
		int a, b, c, d, e, menor, maior;
		
		a = 1 + (int) (Math.random()*10);
		b = 1 + (int) (Math.random()*10);
		c = 1 + (int) (Math.random()*10);
		d = 1 + (int) (Math.random()*10);
		e = 1 + (int) (Math.random()*10);
		
		System.out.println( a + "\t" + b + "\t" + c + "\t" + d + "\t" + e );
		
		a = 1 + (int) (Math.random()*100);
		b = 1 + (int) (Math.random()*100);
		c = 1 + (int) (Math.random()*100);
		d = 1 + (int) (Math.random()*100);
		e = 1 + (int) (Math.random()*100);
		
		System.out.println( a + "\t" + b + "\t" + c + "\t" + d + "\t" + e );
		
		a = 70 + (int) (Math.random()*31);
		b = 70 + (int) (Math.random()*31);
		c = 70 + (int) (Math.random()*31);
		d = 70 + (int) (Math.random()*31);
		e = 70 + (int) (Math.random()*31);
		
		System.out.println( a + "\t" + b + "\t" + c + "\t" + d + "\t" + e );
		
		menor = 70;
		maior = 100;
		
		a = menor + (int) (Math.random()*(maior=menor +1));
		b = menor + (int) (Math.random()*(maior=menor +1));
		c = menor + (int) (Math.random()*(maior=menor +1));
		d = menor + (int) (Math.random()*(maior=menor +1));
		e = menor + (int) (Math.random()*(maior=menor +1));
		
		System.out.println( a + "\t" + b + "\t" + c + "\t" + d + "\t" + e);
	}
}