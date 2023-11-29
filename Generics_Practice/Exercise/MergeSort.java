package Exercise;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> {

    public void sort(T[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(T[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private void merge(T[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        T[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
        T[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i].compareTo(rightArr[j]) <= 0) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args) {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        Integer[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array: " + Arrays.toString(arr));

        mergeSort.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

