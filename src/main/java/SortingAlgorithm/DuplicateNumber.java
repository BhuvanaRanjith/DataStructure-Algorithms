package SortingAlgorithm;

public class DuplicateNumber {
    public static void main(String[] args) {
        int nums[]={2,3,1,2,3};
        System.out.println(findDuplicate(nums));
       // System.out.println(Arrays.toString(nums));
    }
    static int  findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correctindex = nums[i] - 1;
                if (nums[i] != nums[correctindex]) {
                    swap(nums, i, correctindex);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }

        }


return -1;

    }

     static void swap(int[] nums, int first, int second) {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;

    }
}
