package SortingAlgorithm;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] num1={1,2,3,0,0,0};
        int[] num2={2,5,6};
        System.out.println(merge(num1,num2));


    }
    static int merge(int [] num1, int [] num2)
    {
        int temp=0;
        for(int i=0;i<num1.length;i++)
        {
            for(int j=1;j<num2.length-i;j++)

            {
                temp=num1[i]+num2[j];


            }
        }
        return temp;
    }
}
