class DuplicateElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 5};
        findAndPrintDuplicates(array);
    }
    private static void findAndPrintDuplicates(int[] arr) {
        System.out.print("Duplicate Elements: ");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
        }
    }
}
