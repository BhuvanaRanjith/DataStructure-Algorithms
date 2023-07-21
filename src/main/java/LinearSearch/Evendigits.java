package LinearSearch;

public class Evendigits {
    public static void main(String[] args) {

        int[] nums={12,345,2,6,7896,45,1456};
        System.out.println(findNumber(nums));

    }
    static int findNumber(int[] nums)
    {
        int count=0;
       for(int num:nums)
       {
           // call evenno function to check the evenno
           if(evenno(num))
           {
               count++;
           }
       }

        return count;
    }
static boolean evenno(int num)
{

    int evendigitnumber=digit(num);
//    if(evendigitnumber % 2 == 0)
//    {
//        return true;
//    }
//    return false;
    return evendigitnumber % 2==0;
}
//count no of digits in number
     static int digit(int num) {
        int count=0;

        while(num>0)
        {
            count++;
            num=num/10;

        }
        return count;
    }

}


//num=12,345,2,6,7896
//count the no of digits and find the even numbers
//psedocode
//intializte the variable and zero the iterate the for loop
