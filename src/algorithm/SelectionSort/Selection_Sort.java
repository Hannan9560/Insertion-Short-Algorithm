
package algorithm.SelectionSort;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 1, -2, -3};
        for(int i = 0; i < arr.length-1; i++)
        {
            int min  = i;
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[min] > arr[j])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
