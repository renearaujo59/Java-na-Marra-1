package javanamarra;

public class FazendeiroBrown
{
	public static void main ( String[] args )
	{
		for ( int o = 1 ; o <= 100 ; o++ )
		{
			for ( int c = 1 ; c <= 100 ; c++ )
			{
				for ( int g = 1 ; g <= 100 ; g++ )
				{
					if ( o+c+g == 100 && 10.00*o + 3.50*c + 0.50*g == 100.00 )
					{
						System.out.print( o + " ovelhas, " );
						System.out.print( c + " cabras, e " );
						System.out.println( g + " galinhas." );
					}
				}
			}
		}
	}
}