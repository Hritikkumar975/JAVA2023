public class stringrm {
    public static void main(String[] args) {
        String input = "Hello World";
        char ch = 'o';
        String output = removeChar(input, ch);
        System.out.println("Input string: " + input);
        System.out.println("Output string: " + output);
    }

    public static String removeChar(String input, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != ch) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

