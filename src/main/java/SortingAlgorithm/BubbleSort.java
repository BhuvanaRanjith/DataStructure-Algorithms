package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={2,1,3,5,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void bubbleSort(int[] arr)
    {
        //run the steps n-1 time. outer loop for ith index//index size 5 and the loop will run 4 timesArr
        for(int i=0;i< arr.length;i++)
        {
            //while j loop running each and every time greatest element will come into the last index(1234->2134)//compare only two element ,i,j
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
