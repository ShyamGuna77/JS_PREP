import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] elements = {2, 5, 3, 19, 1, 2, 4, 7};
        bubbleSort(elements);
        System.out.println(Arrays.toString(elements)); 
    }

    public static void bubbleSort(int[] elements) {
        int n = elements.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) { 
                if (elements[j] > elements[j + 1]) {
                    
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps occurred in a pass, array is already sorted
            if (!swapped) break;
        }
    }
}
