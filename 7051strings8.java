import java.util.Scanner;
class AddCharactersToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        
        System.out.print("Enter characters to add to the string: ");
        String charactersToAdd = scanner.nextLine();

        
        String resultString = addCharacters(originalString, charactersToAdd);

        
        System.out.println("Result String after adding characters: " + resultString);

        scanner.close();
    }

    
    private static String addCharacters(String originalString, String charactersToAdd) {
        
        StringBuilder result = new StringBuilder(originalString);

       
        result.append(charactersToAdd);

   
        return result.toString();
    }
}