package algorithm.InsertionSort;


/*
##Psudocode
Insertion-Sort(A)
1.  for j <- 2 to length[A]
2.      do key <- A[j]
3.      Insert A[j] into the sorted sequence A[1-----j-1]
4.      i <- j-1
5.      while i > 0 and A[i] > key
6.          do A[i+1] <- A[i]
7.          i <- i -1
8.      A[i+1] <- key
*/

import java.util.Arrays;

public class InsertionShortAlgo {
    public static void main(String[] args) {
       
        int[] arr = {3,5,8,4,1,9,-2};
       
        insertionSort(arr);
        
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int j = 1; j < arr.length; j++)
        {
            int value = arr[j];
            int i = j;
            
            //Find the index j within the sorted subset arr[0..j-1]
            //where element arr[i] belongs
            while(i > 0 && arr[i-1] > value)
            {
                arr[i] = arr[i-1];
                i--;
            }
            arr[i] = value;
            
        }
    }
}


