package SortingAlgorithm;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,4,5,2,1};
        cycilesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycilesort(int [] arr)
    {
        int i=0;
        int n=arr.length;
        while(i< n)
        {
            int correctindex=arr[i]-1;//the given array of i'th index value move into the correct sorted array index.
            if(arr[i]!=arr[correctindex])// the ith index value of array is not equal to correct index value means swap it.
            {
                swap(arr,i,correctindex);
            }
            else {
                i++;
            }
        }
    }

     static void swap(int[] arr, int first, int second) {

        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
