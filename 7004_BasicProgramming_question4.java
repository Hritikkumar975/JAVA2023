class Operation
{
	java.util.Scanner s1=new java.util.Scanner(System.in);
	double n1,n2;
	Operation()
	{
		System.out.print("\nObject is created");
	}
	void input()
	{
		System.out.print("\nEnter the first Number :- ");
			n1=s1.nextDouble();
		System.out.print("\nEnter the Second Number :- ");
			n2=s1.nextDouble();
	}
	void operation()
	{
		System.out.print("\nThe sum of "+n1+" + "+n2+" will be :- "+(n1+n2));
		System.out.print("\nThe subtraction of "+n1+" - "+n2+" will be :- "+(n1-n2));
		System.out.print("\nThe multiplication of "+n1+" * "+n2+" will be :- "+(n1*n2));
		System.out.print("\nThe division of "+n1+" / "+n2+" will be :- "+(n1/n2));
		System.out.print("\nThe remainder of "+n1+" % "+n2+" will be :- "+(n1%n2));

	}
	public static void main(String arr[])
	{
		Operation obj=new Operation();
		obj.input();
		obj.operation();
		
	}
}