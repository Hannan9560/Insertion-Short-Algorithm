
package algorithm.InsertionSort;

import java.util.Arrays;

public class InsertionSortTest {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 3, 5, -2, 3, 6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int j=0; j<arr.length; j++)
        {
            int value = arr[j];
            int i = j;
            while(i>0 && arr[i-1]>value)
            {
                arr[i] = arr[i-1];
                i--;
            }
            arr[i] = value;
        }
    }
    
}
