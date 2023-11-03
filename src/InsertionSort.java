public class InsertionSort {
    public static void main(String[] args) {
        // Arreglo original
        int[] arr = {64, 34, 25, 12, 22, 1, 90, 110, 120, 130, 346, 125, 193, 118};
        System.out.println("Original array: " + java.util.Arrays.toString(arr));

        // Llamada a la función de ordenamiento por inserción
        insertionSort(arr);

        // Impresión del arreglo ordenado
        System.out.println("Insertion Sorted array: " + java.util.Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        // Iterar a través del arreglo desde el segundo elemento
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Elemento actual que estamos comparando e insertando

            int j = i - 1;
            // Mover elementos mayores que key una posición hacia adelante
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Insertar key en la posición correcta
            arr[j + 1] = key;
        }
    }
}
