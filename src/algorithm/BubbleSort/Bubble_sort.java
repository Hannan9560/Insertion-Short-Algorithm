/*
#pseudocode
1.  procedure bubbleSort(A: list of sortable items
2.  n = lenght(A)
3.  repeat
4.  swapped = false 
5.  for i = 1 to n-1 inclusive do
    if this pair is out of order
6.  ifA[i-1]> A[i] then
7.  swap them and remember something changed
8.  swap(A[i-1], A[i])
9.  swapped = true
10. end if
11. end for
12. until not swapped
13. end procedure
*/
package algorithm.BubbleSort;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {2, 4, -2, 5, 6, 8};
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
