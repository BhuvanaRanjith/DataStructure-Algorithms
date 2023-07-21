package BinarySearch;

public class Agnosticsearch {
    public static void main(String[] args) {
 //       int[] arr={-1,-8,-2,3,5,6,17,25,56,78,99};
        int[] arr={99,78,56,17,4,3,2,1,-5,-8};
        int target=-5;

        System.out.println(orderAgnosticsearch(arr,target));

    }
    static int orderAgnosticsearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;// find the length of the arryay-1
        // find wheather the array is ascending or descending order
        boolean isasc=arr[start] < arr[end];


        while (start<=end)
        {
            int mid=start+(end-start)/2; //
            if(arr[mid]==target)
            {
                return mid;
            }

            if(isasc)// if the array is ascending order
            {
                if(target<arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
           else// if the arrary is descending order
            {
                if(target>arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }

        }
        return -1;
    }
}
