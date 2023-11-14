public class strb {

	public static String addCharToString(String str, char c, int pos)
	{
		StringBuffer stringBuffer = new StringBuffer(str);

		stringBuffer.insert(pos, c);
		return stringBuffer.toString();
	}

	public static void main(String[] args)
	{
		String text = "Helo";
		char two = 'l';
		String ctext
			= addCharToString(text, two, 2);
		System.out.println(ctext);
	}
}
