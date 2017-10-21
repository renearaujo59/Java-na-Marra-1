package javanamarra;

public class IntroducaoVetores
{
	public static void main(String[ ] args)
	{
		String[] planetas = {"Mercurio", "Venus", "Terra", "Marte", "Jupiter", "Saturno", "Urano", "Netuno"};

		for (String p : planetas)
		{
		System.out.println(p + "\t" + p.toUpperCase() );
		}
	}
}