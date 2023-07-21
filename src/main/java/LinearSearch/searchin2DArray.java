package LinearSearch;

import java.util.Arrays;

public class searchin2DArray {

    public static void main(String[] args) {
        int[][] arr={{12,23,45},
                {45,78,15},
                {12,8,4}};
        int target=45;
        int ans[]=search2d(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(maxNumber(arr));
    }
    static int maxNumber(int[][]arr)
    {
        int maxvalue=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {

                if(arr[i][j]>maxvalue)
                    maxvalue=arr[i][j];

            }

        }
        return maxvalue;
    }
     static int[] search2d(int[][] arr, int target) {

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
               if(arr[i][j]==target)
                    return new int[]{i,j};

            }

        }
        return new int[]{-1,-1};
    }

}
