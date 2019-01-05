/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.InsertionSort;

import java.util.Arrays;

/**
 *
 * @author root
 */
public class InsertionShortRecursize {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 7, 8, -1};
        insertionShort(arr, 1, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionShort(int[] arr, int i, int n) {
        int value = arr[i];
        int j = i;
        while (j > 0 && arr[j-1] > value) {
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = value;
        
        if(i+1 <= n)
        {
            insertionShort(arr, i+1, n);
        }
    }
    
}
