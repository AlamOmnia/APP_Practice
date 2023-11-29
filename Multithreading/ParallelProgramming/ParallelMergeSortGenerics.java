package ParallelProgramming;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ParallelMergeSortGenerics<E extends Comparable<E>> {

    public static <E extends Comparable<E>> void parallelMergeSort(E[] list) {
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new ParallelMergeSortTask<>(list));
        pool.shutdown();
    }

    private static class ParallelMergeSortTask<E extends Comparable<E>> extends RecursiveTask<E[]> {
        private final E[] array;
        private final int threshold = 1000; // You can adjust this threshold as needed

        ParallelMergeSortTask(E[] array) {
            this.array = array;
        }

        @Override
        protected E[] compute() {
            if (array.length <= threshold) {
                Arrays.sort(array);
                return array;
            } else {
                int mid = array.length / 2;
                E[] leftSubArray = Arrays.copyOfRange(array, 0, mid);
                E[] rightSubArray = Arrays.copyOfRange(array, mid, array.length);

                ParallelMergeSortTask<E> leftTask = new ParallelMergeSortTask<>(leftSubArray);
                ParallelMergeSortTask<E> rightTask = new ParallelMergeSortTask<>(rightSubArray);

                leftTask.fork();
                rightTask.fork();

                E[] leftResult = leftTask.join();
                E[] rightResult = rightTask.join();

                return merge(leftResult, rightResult);
            }
        }

        private E[] merge(E[] left, E[] right) {
            int leftIndex = 0, rightIndex = 0, resultIndex = 0;
            int totalLength = left.length + right.length;
            E[] result = Arrays.copyOf(left, totalLength);

            while (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex].compareTo(right[rightIndex]) <= 0) {
                    result[resultIndex++] = left[leftIndex++];
                } else {
                    result[resultIndex++] = right[rightIndex++];
                }
            }

            while (leftIndex < left.length) {
                result[resultIndex++] = left[leftIndex++];
            }

            while (rightIndex < right.length) {
                result[resultIndex++] = right[rightIndex++];
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {12, 11, 13, 5, 6, 7,45,543,8,87,54,98,2343,879,3545,897};
        System.out.println("Original array:");
        printArray(arr);

        parallelMergeSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static <E> void printArray(E[] arr) {
        for (E value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
