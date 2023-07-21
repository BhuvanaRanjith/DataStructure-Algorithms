package BinarySearch;

public class BinarysearchElement {
    public static void main(String[] args) {
        int[] arr={-1,-8,-2,3,5,6,17,25,56,78,99};
        int target=99;
        System.out.println(binarySearch(arr,target));

    }
    static int binarySearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }

}
