class LeftRotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int positionsToRotate = 2;
        leftRotate(array, positionsToRotate);
        System.out.print("Rotated Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    private static void leftRotate(int[] arr, int positions) {
        int length = arr.length;
        positions = positions % length;
        int[] temp = new int[positions];

        for (int i = 0; i < positions; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < length - positions; i++) {
            arr[i] = arr[i + positions];
        }
        for (int i = 0; i < positions; i++) {
            arr[length - positions + i] = temp[i];
        }
    }
}
