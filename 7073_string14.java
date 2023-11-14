class CountC{
    public static void main(String[] args) {
        // Example string
        String inputString = "Hello, World!";

        // Count the number of characters
        int charCount = countCharacters(inputString);

        // Print the result
        System.out.println("Number of characters in the string: " + charCount);
    }

    // Function to count characters in a string
    private static int countCharacters(String str) {
        // Check for null or empty string
        if (str == null || str.isEmpty()) {
            return 0;
        }

        // Return the length of the string
        return str.length();
    }
}
