package StringClass;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String str="";
        System.out.println(palindrome(str));
    }
//    public static boolean palindrome(String str)
//    {
//        StringBuilder sb=new StringBuilder(str);
//        StringBuilder str1=sb.reverse();
//        System.out.println(str1);
//        if(str.equalsIgnoreCase(String.valueOf(str1)))
//
//        {
//            return true;
//        }
//        return false;
//     }
    public static boolean palindrome(String str)

    {
        if(str==null || str.length() == 0)
        {
            return true;
        }
      for(int i=0;i<=str.length()/2;i++)
        {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start==end)
            {
                return true;
            }
        }
        return false;
    }
}
