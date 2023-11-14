class Exception
{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
        int[] arr = new int[5];
        
        arr[10] = 50; // This statement will throw an exception
    }
}
