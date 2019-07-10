/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.BubbleSort;

/**
 *
 * @author root
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = {5, 6, -1, 5, 4, 3, -4};
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = 0; j < arr.length-1-i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
