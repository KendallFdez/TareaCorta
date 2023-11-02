public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 110, 120, 130, 122, 125, 193, 118};
        System.out.println("Original array: " + java.util.Arrays.toString(arr));

        arr = selectionSort(arr);
        System.out.println("Selection Sorted array: " + java.util.Arrays.toString(arr));
    }

    public static int[] selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            if (minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }

        return arr;
    }
}