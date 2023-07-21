package LinearSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInstrings {
    public static void main(String[] args) {
       String[] str={"aaaa","bbb","werw","janani","hello","start","end"};
       String target="hello";
        System.out.println(Lineasrstring(str,target));
        String str1="bhuvana";
        char target2='e';
        System.out.println(Lineasrstring2(str1,target2));

    }
    static boolean Lineasrstring2(String str1,char target)
    {
        if(str1.length()==0)
            return false;
        for(char ch:str1.toCharArray())
        {
            if (ch==target)
            {
                return true;
            }
        }
        return false;
    }

    static boolean Lineasrstring(String[] str,String target)
    {
        if(str.length==0)
        return false;
        for(int i=0;i< str.length;i++)
        {
            String element=str[i];
            if(target==element)
                return true;

        }
            return false;
    }
}
