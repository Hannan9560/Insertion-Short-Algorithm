
package algorithm.MargeSort;

import java.util.Arrays;

public class Merge_Sort_Exercise {
    public static void main(String[] args) {
        int[] arr = {14, 33, 27, 10, 35, 19, 42, 44};
        System.out.println("Unsorted array: "+Arrays.toString(arr));
        mSort(arr, 0, arr.length-1);
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }

    private static void mSort(int[] arr, int start, int end) {
        if(start < end)
        {
            int m = (start + end)/2;
            mSort(arr, start, m);
            mSort(arr, m+1, end );
            
            merge(arr, start, m, end);
        }
    }

    private static void merge(int[] arr, int start, int m, int end) {
        int n = m - start + 1;
        int n1 = end - m;
        
        
        //create temp arrays
        int L[] = new int[n];
        int R[] = new int[n1];
        
        for(int i = 0; i < n; i++)
        {
            L[i] = arr[start+i];
        }
        
        for(int j = 0; j< n1; j++)
        {
            R[j] = arr[m+1+j];
        }
        
        int i = 0, j = 0, k = start;
        
        while(i < n && j < n1)
        {
            if(L[i] < R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while(i < n)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while(j < n1)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
        
        
    }
}
