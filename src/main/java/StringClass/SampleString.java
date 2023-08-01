package StringClass;

public class SampleString {
    public static void main(String[] args) {
        String a="Hello";
        String b="Hello";
        System.out.println(a==b);

        String name1=new String("Hello");
        String name2=new String("Hello");
        System.out.println(name1==name2);
        System.out.println(name1.equalsIgnoreCase(name2));
    }

}
