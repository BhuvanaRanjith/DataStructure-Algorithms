package SortingAlgorithm;
//41. First Missing Positive-https://leetcode.com/problems/first-missing-positive/
//Input: nums = [1,2,0]
//Output: 3
//Explanation: The numbers in the range [1,2] are all in the array.
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums={7,8,9,11,12};
        int ans=firstMissingPositive(nums);
        System.out.println(ans);


    }

    public static int firstMissingPositive(int[] nums) {
        int i=0;
        int n=nums.length;
        while (i<n)
        {
            int correctindex=nums[i]-1;

            if(nums[i]>0 && nums[i] <= n && nums[i]!=nums[correctindex])
            {
                swap(nums,i,correctindex);
            }
            else
            {
                i++;
            }
        }
        for(int index=0;index<n;index++)
        {
            if(nums[index]!=index+1)
            {
                return index+1;
            }
        }
        return n+1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;


    }

}
