import java.util.Random;
public class Sorter {
    public int[] basicSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            // loop for finding the lowest index
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex]; // temp var to change array[i]
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
    public void advancedSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    public void quickSort(int[] array, int start, int end) {

        if(end <= start) return; // base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    public static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
//      System.out.println(Arrays.toString(array)); // Can be used to check where is the pivot
        return i;
    }
    public int[] generateRandomArray(int size) {
        Random rd = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(10000);
        }
        return arr;
    }
}
