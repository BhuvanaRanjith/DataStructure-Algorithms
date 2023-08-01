package StringClass;

import java.util.ArrayList;

public class Formatprinting {
    public static void main(String[] args) {
        float f=453.2173f;
        System.out.format("Formatted Output is %.2f",f);// returnt the formatted string which we can store or reuse
        System.out.println(" ");
        System.out.printf("Pie : %.3f",Math.PI);// only print the value like println() mehtod.
        System.out.println(" ");
        System.out.printf("My name is %s and I am %s","zombie","Monkey");
        System.out.println(" ");
        System.out.println('a'+'b');//char ascii value
        System.out.println("a"+"b");
        System.out.println('a'+1);
        System.out.println("a"+1);
        System.out.println("Hello"+ new ArrayList<>());
    }
}
