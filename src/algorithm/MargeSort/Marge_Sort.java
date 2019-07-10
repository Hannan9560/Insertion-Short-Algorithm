
package algorithm.MargeSort;

import java.util.Arrays;

public class Marge_Sort {
    public static void main(String[] args) {
        int[] arr = {14, 33, 27, 10, 35, 19, 42, 44};
        margesort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void margesort(int[] arr, int start, int end) {
        if(start < end)
        {
            int m = (start + end)/2;
            margesort(arr, start, m);
            margesort(arr, m+1, end);
            
            merge(arr, start, m, end);
        }
        
    }

    private static void merge(int[] arr, int start, int m, int end) {
        int n = m - start + 1;
        int n1 = end - m;
        
        
        int L[] = new int[n];
        int R[] = new int[n1];
        
        for(int i = 0; i<n; i++)
            L[i] = arr[start + i];
        
        for(int j = 0; j < n1; j++)
            R[j] = arr[n1 + 1 + j];
        
        int i = 0, j = 0;
        
        int k = start;
        
        while( i < n && j < n1)
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
