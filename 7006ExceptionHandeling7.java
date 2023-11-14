 class VowelChecker {

    public static void main(String[] args) {
        try {
            checkForVowels("Hello World"); // Example with vowels
            // Uncomment the line below to test with a string without vowels
            // checkForVowels("123456");
        } catch (NoVowelsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method to check for vowels in a string
    public static void checkForVowels(String input) throws NoVowelsException {
        if (!containsVowels(input)) {
            throw new NoVowelsException("The string does not contain any vowels.");
        } else {
            System.out.println("The string contains vowels.");
        }
    }

    // Helper method to check if a string contains vowels
    private static boolean containsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}

// Custom exception class for situations where no vowels are found in the input string
class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}