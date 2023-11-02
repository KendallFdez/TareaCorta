import java.util.Random;
import java.util.stream.IntStream;

public class ProbarAlgoritmos {
    public static void main(String[] args) {
        double segundos=convertNanosecondsToSeconds(printElapsedTime());
        System.out.println("Duro " + segundos);
    }

    public static int[] getRandomArray(int length) {
        Random random = new Random();
        return IntStream.generate(() -> random.nextInt(1000000) + 1)
                .limit(length)
                .toArray();
    }
    public static long printElapsedTime() {
        int[] array10000 = getRandomArray(10000);
        int[] array100000 = getRandomArray(100000);
        int[] array1000000 = getRandomArray(1000000);
        BubbleSort bubble = new BubbleSort();
        SelectionSort selection = new SelectionSort();
        long startTime = System.nanoTime();

        bubble.bubbleSort(array1000000);

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        System.out.println("Function lasted for: " + elapsedTime + " nanoseconds.");
        return elapsedTime;
    }
    public static double convertNanosecondsToSeconds(long nanoseconds) {
        return (double) nanoseconds / 1_000_000_000.0;
    }
}

