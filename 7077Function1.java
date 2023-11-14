
class Test
{
    static void smallNumber(int n1, int n2, int n3)
    {
        if (n1 > n2)
            if (n2 > n3)
                System.out.println(n3);
            else
                System.out.println(n2);
        else
            if (n1 > n3)
                System.out.println(n3);
            else
                System.out.println(n1);
    }
    public static void main(String args[])
    {
        Test t = new Test();
        
        t.smallNumber(6,4,9);
        t.smallNumber(24,23,4);
    }
}