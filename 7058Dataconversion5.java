// Data conversion:- 5. How to convert string to float.     By(7058/21)
import java.io.*;

// Main class
class STF {

	
	public static void main(String[] args)
	{
		
		String str = "100.9";

		
		float val = Float.parseFloat(str);

		
		System.out.println("String is converted to float "
						+ val);
	}
}
