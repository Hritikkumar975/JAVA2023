//Program no. : strings 10
//Program name : Program to check whether a string is a Palindrome


class Palindrome {

        public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int length = str.length();

        if (length <= 1) {
            return true;
        }

        if (str.charAt(0) != str.charAt(length - 1)) {
            return false;
        }

        return isPalindrome(str.substring(1, length - 1));
    }

    public static void main(String[] args) {
        String input = "mom"; 

        System.out.println("Given string is : " + input);

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}


