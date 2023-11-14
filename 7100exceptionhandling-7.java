class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}

public class VowelChecker {
    public static void checkForVowels(String input) throws NoVowelsException {
        if (!input.matches(".*[aeiouAEIOU].*")) {
            throw new NoVowelsException("The input string does not contain any vowels.");
        }
    }

    public static void main(String[] args) {
        try {
            String testString1 = "Hello, World";
            checkForVowels(testString1);

            String testString2 = "Rhythm";
            checkForVowels(testString2);
        } catch (NoVowelsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
