
public class CheckDigitsInString {
    public static void main(String[] args) {
        // Test strings
        String str1 = "12345";    // Contains only digits
        String str2 = "abc123";   // Contains non-digit characters

        // Check if str1 contains only digits
        if (containsOnlyDigits(str1)) {
            System.out.println(str1 + " contains only digits.");
        } else {
            System.out.println(str1 + " does not contain only digits.");
        }

        // Check if str2 contains only digits
        if (containsOnlyDigits(str2)) {
            System.out.println(str2 + " contains only digits.");
        } else {
            System.out.println(str2 + " does not contain only digits.");
        }
    }

    // Function to check if a string contains only digits
    private static boolean containsOnlyDigits(String str) {
        // Using regular expression to match digits
        return str.matches("\\d+");
    }
}
