
public class PatternDisplay 
{
	public static void main (String[]args)
	{
System.out.println("");
{
	for (int i=0; i<5; i++)
	{
		for (int j=0; j<5; j++)
		{
			if (j==i||j==(5-1-i))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
	System.out.println();
	}
}
	}

}

