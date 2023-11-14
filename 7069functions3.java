public class MiddleCharacter {
    public static void main(String[] args) {

        String oddstring = "abcdefg";
        String evenstring = "abcd";

        display(oddstring);

        display(evenstring);
    }

    static void display(String str) {
        int length = str.length();

        System.out.println("Original string: " + str);

        if (length % 2 == 0) {
            int middleIndex1 = length / 2 - 1;
            int middleIndex2 = length / 2;
            System.out.println("Middle character: " + str.charAt(middleIndex1) + str.charAt(middleIndex2));
        } 
        else {
            int middleIndex = length / 2;
            System.out.println("Middle character(s): " + str.charAt(middleIndex));
        }

        System.out.println();
    }
}
