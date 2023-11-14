public class EvenPositionElements{
    public static void main(String[] args) {
        // Sample array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Elements at even positions:");
        printEvenPositionElements(array);
    }
    static void printEvenPositionElements(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
    }
}
