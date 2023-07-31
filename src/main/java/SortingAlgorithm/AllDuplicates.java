package SortingAlgorithm;

import java.util.Arrays;

public class AllDuplicates {
    public static void main(String[] args) {
        int nums[]={1,1,2};
        int[] ans=findDuplicates(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findDuplicates(int[] nums) {
    int i=0;
    while (i<nums.length)
    {
        int correctindex=nums[i]-1;
        if( nums[i]!=nums[correctindex])
        {
            swap(nums,i, correctindex);

        }
        else {
            i++;
        }
    }
      //  ArrayList<Integer> list=new ArrayList<Integer>();

    for(int index=0;index<nums.length;index++)

    {
        if(nums[index]!=index+1)
        {
           return new int[]{nums[index]};

        }
    }
return new int[]{-1};

    }

    static void swap(int[] nums, int ifirst, int second) {
        int temp=nums[ifirst];
        nums[ifirst]=nums[second];
        nums[second]=temp;

    }
}
