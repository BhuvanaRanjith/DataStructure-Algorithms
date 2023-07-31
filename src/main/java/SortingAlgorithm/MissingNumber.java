package SortingAlgorithm;
//https://leetcode.com/problems/missing-number/
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
      //  missingNumber(arr);
        System.out.println(missingNumber(arr));

    }
    static int missingNumber(int []arr)
    {
        int i=0;
        int n=arr.length;
        while (i<n)
        {
            int correctindex=arr[i];

            if(arr[i] < n && arr[i]!=arr[correctindex])
            {
                swap(arr,i,correctindex);
            }
            else
            {
                i++;
            }
        }
        for(int index=0;index<n;index++)
        {
            if(arr[index]!=index)
            {
                return index;
            }
        }
        return n;
    }

     static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;


    }
}


