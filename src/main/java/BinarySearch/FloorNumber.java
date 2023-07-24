package BinarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 17, 25, 56, 78, 99};
        int target = 7;
        System.out.println(floorsearch(arr,target));

    }
    static int floorsearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            //in this code if we search the given array value it represent the array index. equal to binary search
            //greatest number of less then or equal to target(<=target)
            int mid = start + (end-start)/2;

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
        return end;
    }

}

