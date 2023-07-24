package BinarySearch;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {3,5,6,17,25,56,78,99};
        int target = 1;
        int ans=ceilingNumber(arr,target);
        System.out.println(ans);
    }

    static int ceilingNumber(int[] arr, int target) {
    //but what if the target gretaen then the greatest number of array
        if(target>arr.length-1)
        {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return start;
    }
}