class LargestElement {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7, 6, 4, 8, 3, 10};
        int largest = findLargestElement(array);
        System.out.println("Largest Element: " + largest);
    }
    private static int findLargestElement(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
}
