
 class SmallestNumberFinder {
    public static int findSmallestNumber(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;
        int number3 = 8;

        int smallest = findSmallestNumber(number1, number2, number3);

        System.out.println("The smallest number is: " + smallest);
    }
}