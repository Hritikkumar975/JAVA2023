public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        int[] copyArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            copyArray[i] = originalArray[i];
        }

        System.out.print("copy Array: ");
        for (int num : copyArray) {
            System.out.print(num + " ");
        }
    }
}
