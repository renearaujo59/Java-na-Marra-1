package javanamarra;

public class FormulaDeHeron
{
	public static void main(String[] args)
	{
		double a;

		a = areaDoTringulo(3, 3, 3);
		System.out.println("Um triângulo com arestas 3, 3, 3 tem uma área igual a " + a);

		a = areaDoTringulo(3, 4, 5);
		System.out.println("Um triângulo com arestas 3, 4, 5 tem uma área igual a " + a);

		a = areaDoTringulo(7, 8, 9);
		System.out.println("Um triângulo com arestas 7, 8, 9 tem uma área igual a " + a);

		System.out.println("Um triângulo com arestas 5, 12, 13 tem uma área igual a " + areaDoTringulo(5, 12, 13) );
		System.out.println("Um triângulo com arestas 10, 9, 11 tem uma área igual a " + areaDoTringulo(10, 9, 11) );
		System.out.println("Um triângulo com arestas 8, 15, 17 tem uma área igual a " + areaDoTringulo(8, 15, 17) );
	}

	public static double areaDoTringulo(int a, int b, int c)
	{
		// o código nessa função calcula a área de um triângulo com os lados de tamanho a, b e c
		double s, A;

		s = (a+b+c) / 2;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c));

		return A;
		// ^ depois de calcular "retorne a área"
	}
}