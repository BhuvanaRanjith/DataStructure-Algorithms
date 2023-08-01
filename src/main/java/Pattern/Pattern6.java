package Pattern;

public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);

    }
    static void pattern6(int n)
    {
        for(int row=1;row<2*n;row++)
        {
            int totalcolinrow=row>n ? 2 * n -row:row;

            int toatalspaces=n-totalcolinrow;

            for(int s=0;s<toatalspaces;s++)
            {
                System.out.print(" ");
            }
            for (int col=0;col<totalcolinrow;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
