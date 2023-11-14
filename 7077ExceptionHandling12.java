import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{
		try
		{
		    Scanner scn = new Scanner(System.in);
			
            int n = Integer.parseInt(scn.nextLine());
		
			if (99%n == 0)
				System.out.println(n + " is a factor of 99");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic you logical calutation error ");
		}
		catch (NumberFormatException e)
		{
			System.out.println("Number Format Exception please set this ");
		}
        finally
        {
            System.out.println("are you programmer");
        }
	}
}

