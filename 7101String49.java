
//Create an object StringBuffer class to reverse the string.


class StringBufferReverse {
    public static String reverseString(String input) {
     
        StringBuffer stringBuffer = new StringBuffer(input);

        
        stringBuffer.reverse();

        
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String originalString = "Java Programming";
        String reversedString = reverseString(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
