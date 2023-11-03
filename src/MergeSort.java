public class MergeSort {
    public static void main(String[] args) {
        // Arreglo original
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 110, 180, 130, 122, 125, 350, 118};
        System.out.println("Original array: " + java.util.Arrays.toString(arr));

        // Llamada a la función Merge Sort
        mergeSort(arr, 0, arr.length - 1);

        // Impresión del arreglo ordenado
        System.out.println("Merge Sorted array: " + java.util.Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Encontrar el punto medio del arreglo
            int mid = (left + right) / 2;

            // Dividir el arreglo en dos mitades y ordenarlas por separado
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Mezclar las dos mitades ordenadas
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Crear arreglos temporales
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copiar datos a los arreglos temporales
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        // Combinar las dos mitades en el arreglo original
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes, si los hay
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
