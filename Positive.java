import java.util.Scanner;

public class Positive
{
   public static void main(String args[])
     {
        System.out.print("\nEnter a number: ");
	Scanner reader = new Scanner(System.in);
	int num = reader.nextInt();
	String result = num > 0 ? "Positive number" : "Negative number"; // Ternary operator
	System.out.print("Entered number is a " + result );
     }
}