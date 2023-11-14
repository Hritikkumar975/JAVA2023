
class Test
{
    static void adiPass(String pass)
    {
        if (pass == "holesale")
        {
            System.out.println("password valid");
        }
        else
        {
            System.out.println("password unvalid");
        }
    }
    public static void main(String args[])
    {
        Test t = new Test();
        
        t.adiPass("holesale");
        t.adiPass("holesales");
    }
}