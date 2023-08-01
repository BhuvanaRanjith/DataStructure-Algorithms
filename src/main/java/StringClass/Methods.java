package StringClass;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name="Hello world";
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        StringBuilder sb=new StringBuilder(name);
        sb.reverse();
        System.out.println(sb);
    }

}
