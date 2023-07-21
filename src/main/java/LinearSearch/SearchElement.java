package LinearSearch;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr={12,13,45,8,9,7,56,48,59,12,45,86,79};
        int target=56;
        int ans=LinearSearch(arr,target);
        System.out.println(ans);

    }
    static int LinearSearch(int[] arr,int target) {
        if (arr.length == 0)
            return -1;
        for(int index=0;index<arr.length;index++)
        {
            int element=arr[index];
            if(target==element)
                return index;

        }
        return Integer.MAX_VALUE;
    }
}
