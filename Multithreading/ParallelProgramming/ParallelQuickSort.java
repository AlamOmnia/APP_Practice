package ParallelProgramming;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

import Exercise.MergeSort;
import Exercise.QuickSort;

public class ParallelQuickSort {

    public static void parallelQuickSort(int[] list) {
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new QuickSortTask(list, 0, list.length - 1));
        pool.shutdown();
    }

    static class QuickSortTask extends RecursiveAction {
        private final int[] array;
        private final int left;
        private final int right;

        public QuickSortTask(int[] array, int left, int right) {
            this.array = array;
            this.left = left;
            this.right = right;
        }

        @Override
        protected void compute() {
            if (left < right) {
                int partitionIndex = partition(array, left, right);

                QuickSortTask leftTask = new QuickSortTask(array, left, partitionIndex - 1);
                QuickSortTask rightTask = new QuickSortTask(array, partitionIndex + 1, right);

                leftTask.fork();
                rightTask.fork();

                leftTask.join();
                rightTask.join();
            }
        }

        private int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = (low - 1);

            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
        }
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 1, 4};
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        long startTime= System.currentTimeMillis();
        parallelQuickSort(arr);
        long endTime= System.currentTimeMillis();
        System.out.println("Parallel time:"+ (startTime-endTime));
         startTime= System.currentTimeMillis();
        QuickSort quickSort= new QuickSort<>();
        //quickSort.sort(arr);
         endTime= System.currentTimeMillis();
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
}
