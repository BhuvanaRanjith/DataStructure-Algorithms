package LinearSearch;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        System.out.println(minimumNumber(arr));
    }
    static int minimumNumber(int[] arr)
    {
        int minValue=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<minValue)
                minValue=arr[i];

        }
        return minValue;
    }
}
