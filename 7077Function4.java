
class Test
{
    static void counter(String line)
    {
        int n = 0;
        
        for (char c : line.toCharArray())
        {
            if (Character.isLetter(c))
            {
                n++;
            }
        }
        System.out.println(" word in string "+n);
    }
    public static void main(String args[])
    {
        Test t = new Test();
        
        t.counter("Hello sir");
    }
}