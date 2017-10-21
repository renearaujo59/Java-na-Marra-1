import java.net.URL;
import java.util.Scanner;
import java.util.Locale;
public class TemperaturaMinima
{
	public static void main(String[] args) throws Exception
	{
		double[] temps = vetorAPartirDeURL("http://learnjavathehardway.org/txt/avg-daily-temps-atx.txt");

		System.out.println( temps.length + " temperaturas na base.");

		double minima = 9999.99;

		for ( int i=0 ; i<temps.length ; i++ )
		{
			if ( temps[i] < minima )
			{
				minima = temps[i];
			}
		}

		System.out.print( "A temperatura minima foi " );
		System.out.println( minima + "F (" + fParaC(minima) + "C)" );
	}

	public static double[] vetorAPartirDeURL(String url) throws Exception
	{
		Scanner fin = new Scanner((new URL(url)).openStream()); fin.useLocale(Locale.ENGLISH);
		int quantidade = fin.nextInt();

		double[] dubs = new double[quantidade];

		for ( int i=0 ; i<dubs.length ; i++ )
			dubs[i] = fin.nextDouble();
		fin.close();

		return dubs;
	}

	public static double fParaC( double f )
	{

		return (f-32) * 5/9;
	}

}