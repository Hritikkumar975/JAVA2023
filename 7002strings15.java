// Program to count the total number of punctuation characters exists in a String in java
class Main {
    public static void main(String[] args) {

        String str = "Coder, here\n How are you? All good.";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.'
                    || str.charAt(i) == '?' || str.charAt(i) == '-' || str.charAt(i) == '\'' || str.charAt(i) == '\"'
                    || str.charAt(i) == ':') {
                count++;
            }
        }
        System.out.println("The total number of punctuation characters is: " + count);
    }

}