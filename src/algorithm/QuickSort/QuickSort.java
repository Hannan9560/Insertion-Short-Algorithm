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
public class QuickSort {
    public static void main(String[] args) {
        int a[] = {9, -3, 5, 2, 6, 8, -6, 1, 3};
        quicksort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void quicksort(int[] a, int start, int end) {
        if(start >= end)
        {
            return;
        }
        int pivot = partition(a, start, end);
        quicksort(a, start, pivot - 1);
        quicksort(a, pivot + 1, end);
    }

    private static int partition(int[] a, int start, int end) {
        int pivot = a[end];
        
        int pIndex = start;
        for(int i = start; i < end; i++)
        {
            if(a[i] <= pivot)
            {
                swap(a, i, pIndex);
                pIndex++;
            }
        }
        swap(a, end, pIndex);
        return pIndex;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
