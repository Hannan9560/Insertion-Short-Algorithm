/*

## Pseudocode
1.  selectionSort(A, N)
2.  put 1 into j --j is used to set through the B list
3.  repeat until j > N
4.  put minimum(A[j]....A[N}, N-j+1) into min
5.  swap A[j], A[min]
6.  add 1 to j
7.  end repeat
8.  retun A
9.  end selectionSort
*/

package algorithm.SelectionSort;

import java.util.Arrays;

public class SelectionShort {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 8, 4, 1, 9, -2};
        
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        //run (arr.lenght - 1) times
        for(int i= 0; i < arr.length - 1; i++)
        {
            //find the minimum element in the unsorted sub-array[i..n-1]
            //add swap it with arr[i]
            
            int min = i;
            
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            swap(arr, min, i);
        }
    }

    private static void swap(int[] arr, int min, int j) {
        int temp = arr[j];
        arr[j]=arr[min];
        arr[min]=temp;
    }
}
