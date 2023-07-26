public class Infinitearray {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr,target));
        }

    static int ans(int[] arr,int target)
    {
        int start=0;
        int end=1;//infinit array hence we dont know the array length. assume end =1
        while (target>arr[end])//4>1
        {
            int newstart=end+1;//newstart=2
            end=end+(end-start+1)*2;//we have to compare the value double of size/
            start=newstart;
        }
        return (findRange(arr,target,start,end));
    }

    static int findRange(int[] arr,int target,int start, int end)
    {
        while (start<=end)
        {
            int mid=start+(end-start)/2;

            if(target<arr[mid])
            {
                end=mid-1;
            }
            if(target>arr[mid])
            {
              start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}