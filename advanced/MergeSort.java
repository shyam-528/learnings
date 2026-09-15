/**
 * 02 - MergeSort
 * Sorts an array with MergeSort: divide, sort halves, merge. O(n log n).
 *
 * Concepts: recursion, divide & conquer, merging, stable sort.
 *
 * Run:
 *   javac MergeSort.java
 *   java MergeSort
 *
 * Sample output:
 *   Before: [12, 4, 7, 1, 9, 3]
 *   After:  [1, 3, 4, 7, 9, 12]
 */
import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 1, 9, 3};
        System.out.println("Before: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After:  " + Arrays.toString(arr));
    }
}
