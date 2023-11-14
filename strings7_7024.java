/* Program to Add characters to a string. */

public class strings7_7024 {
    public static String addCharacters(String originalString, String charactersToAdd) {
        return originalString + charactersToAdd;
    }

    public static void main(String[] args) {
        String originalString = "Java ";
        String charactersToAdd = "Programs";
        String newString = addCharacters(originalString, charactersToAdd);
        System.out.println(newString);
    }
}