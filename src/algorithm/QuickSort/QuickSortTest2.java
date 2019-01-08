/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.QuickSort;

import java.util.Arrays;

/**
 *
 * @author root
 */
public class QuickSortTest2 {
    public static void main(String[] args) {
        int arr[] = {9, -3, 5, 2, 6, 8, -6, 1, 3};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start >= end)
        {
            return;
        }
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int pIndex = end;
       
        for(int i = end; i > start; i--)
        {
            if(pivot <= arr[i])
            {
                swap(arr, i, pIndex);
                pIndex--;
            }
        }
        swap(arr, start, pIndex);
        return pIndex;
    }

    private static void swap(int[] arr, int i, int pIndex) {
         int temp = arr[i];
        arr[i] = arr[pIndex];
        arr[pIndex] = temp;
    }
}
