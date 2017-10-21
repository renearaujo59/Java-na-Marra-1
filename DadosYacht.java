package javanamarra;

public class DadosYacht
{
	public static void main(String[] args)
	{
		int dado1, dado2, dado3, dado4, dado5;
		boolean todosIguais;

		do
		{
			dado1 = 1 + (int)(Math.random() * 6);
			dado2 = 1 + (int)(Math.random() * 6);
			dado3 = 1 + (int)(Math.random() * 6);
			dado4 = 1 + (int)(Math.random() * 6);
			dado5 = 1 + (int)(Math.random() * 6);
			System.out.println("\nVoce jogou os dados: " + dado1 + " " + dado2 + " " + dado3 + " " + dado4 + " " + dado5);
			mostraDado(dado1);
			mostraDado(dado2);
			mostraDado(dado3);
			mostraDado(dado4);
			mostraDado(dado5);
			todosIguais = (dado1 == dado2 && dado2 == dado3 && dado3 == dado4 && dado4 == dado5);

		} while ( ! todosIguais );
		System.out.println("Yacht!!");
	}

	public static void mostraDado(int dado)
	{
		System.out.println("+---+") ;
		if (dado == 1)
		{
			System.out.println("|   |");
			System.out.println("| o |");
			System.out.println("|   |");
		}
		else if (dado == 2)
		{
			System.out.println("|o  |");
			System.out.println("|   |");
			System.out.println("|  o|");
		}
		else if (dado == 3)
		{
			System.out.println("| o |");
			System.out.println("| o |");
			System.out.println("| o |");
		}
		else if (dado == 4)
		{
			System.out.println("|o o|");
			System.out.println("|   |");
			System.out.println("|o o|");
		}
		else if (dado == 5)
		{
			System.out.println("|o o|");
			System.out.println("| o |");
			System.out.println("|o o|");
		}
		else if (dado == 6)
		{
			System.out.println("|o o|");
			System.out.println("|o o|");
			System.out.println("|o o|");
		}
		System.out.println("+---+");
	}
}