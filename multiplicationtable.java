import java.util.Scanner;

public class MultiplicationTable
{
	public static void main (String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number for which table is required. Number = ");
		int num = reader.nextInt();
		for (int i=1; i<11; i++)
		{
			System.out.print(num + " x " + i + "  = " + num*i + "\n");
		}
	}
}
