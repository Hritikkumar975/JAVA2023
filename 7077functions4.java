class A{
    int display(String line){

        int count = 1;

        for (int i = 0; i < line.length(); i++) {
            // System.out.println(line.charAt(i));

            if (line.charAt(i) == ' ')
                count++;
        }

        return count;
    }
    public static void main(String rgs[]){
       A obj = new A();
       System.out.println(obj.display("string is return number of word"));

    }
}