
import java.util.Scanner;

public class OpenShift 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("This program is a test of the Rat Hat OpenShift Container Platform");
		
		System.out.println("Is OpenShift the best container based platform?");
		
		String answer = keyboard.nextLine();
		
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("You are correct!!");
		}
		else
		{
			System.out.println("You are wrong!!");
		}
		
	}

}
