import java.util.Scanner;

 class Removecharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the character to be removed: ");
        char charToRemove = scanner.next().charAt(0);
        String resultString = removeCharacter(inputString, charToRemove);
        System.out.println("Result after removing '" + charToRemove + "': " + resultString);
        scanner.close();
    }
    private static String removeCharacter(String inputString, char charToRemove) {
        StringBuilder result = new StringBuilder();
        for (char currentChar : inputString.toCharArray()) {
            if (currentChar != charToRemove) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
