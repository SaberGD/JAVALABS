package com.mycompany.quicksort;
public class QUICKSORT {
    static void QS(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int i = low;
        int j = high;
        int pivot = arr[high];
        while (i < j) {
            while (arr[i] <= pivot && i < j) {
                i++;
            }
            while (arr[j] >= pivot && i < j) {
                j--;
            }
            swap(arr, i, j);

        }
        swap(arr, i, high);
        QS(arr, 0, i - 1);
        QS(arr, i + 1, high);
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int array[] = { 1, 8, 56, 10, 15, 7, 30 };
        System.out.println("array before sorting is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        QS(array, 0, array.length - 1);
        System.out.println("\narray after sorting is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}