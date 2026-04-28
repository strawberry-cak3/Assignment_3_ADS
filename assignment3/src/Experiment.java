import java.util.Arrays;

public class Experiment {
    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        long startTime = System.nanoTime();

        if (type.equals("Basic")) {
            sorter.basicSort(copy);
        } else if (type.equals("Advanced")) {
            sorter.advancedSort(copy);
        }

        return System.nanoTime() - startTime;
    }

    public long measureSearchTime(int[] arr, int target) {
        long startTime = System.nanoTime();
        searcher.search(arr, target);
        return System.nanoTime() - startTime;
    }

    public void runAllExperiments(int size) {
        int[] randomArray = sorter.generateRandomArray(size);

        long basicTime = measureSortTime(randomArray, "Basic");
        long advancedTime = measureSortTime(randomArray, "Advanced");
        long searchTime = measureSearchTime(randomArray, -1); // worst case

        System.out.println("Array Size: " + size);
        System.out.println("Selection Sort: " + basicTime + " ns");
        System.out.println("Quick Sort: " + advancedTime + " ns");
        System.out.println("Linear Search: " + searchTime + " ns");
        System.out.println("-------------------------");
    }
}
