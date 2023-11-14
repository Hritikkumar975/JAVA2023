class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String inputString = "This is a string with white spaces";

        
        String stringWithoutSpaces = inputString.replaceAll("\\s", "");

        System.out.println("Original String: " + inputString);
        System.out.println("String without Spaces: " + stringWithoutSpaces);
    }
}
