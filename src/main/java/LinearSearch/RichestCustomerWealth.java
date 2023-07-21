package LinearSearch;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts={{1,5},{7,3},{3,5}};
        int ans=maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++)
        {
            int rowsum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                 rowsum+=accounts[i][j];

            }
            if(rowsum>max)
            {
                max=rowsum;
            }
        }
return max;

    }
}
