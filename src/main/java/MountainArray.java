public class MountainArray {
    public static void main(String[] args) {
        int arr[]={0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while (start<end)
        {
            int mid=start=(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                //you are in decreasing part of the array
                //this may be the answer
                //check once again in left side as well
                end=mid;
                 }
            else
            {
                //you are in ascending part of array

                start=mid+1;//because we know that mid+1 element is > mid element

            }
        }
        //in the end start==end bcoz of the above two cheks. that is the largest number.
        //start and end always trying to find maximum element is the above two checks
        //when the start and end pointing to one element that is the maximum element.
        // more ellobration: at every time the start and end searching the maximum number until the single maximum element in the arrary
        //using the above checks.
        return start;
    }
}
