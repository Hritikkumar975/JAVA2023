import java.util.HashMap;
import java.util.Map;

public class dupl {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 7, 8, 3}; // Your array

        dupl(array);
    }

    static void dupl(int[] arr) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        for (int element : arr) {
            if (elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                elementCountMap.put(element, 1);
            }
        }

        // Print the duplicate elements
        System.out.println("Duplicate elements in the array are:\n");
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
