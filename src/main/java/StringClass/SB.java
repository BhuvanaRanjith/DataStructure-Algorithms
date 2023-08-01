package StringClass;

public class SB {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            sb.append(ch);
        }
        System.out.println(sb.toString());
        System.out.println(sb.reverse());

        StringBuilder sb1=new StringBuilder("Bhuvana");

        sb1.reverse();
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1.charAt(2));
        System.out.println(sb1.append("Ranjith"));
        System.out.println(sb1.append("  "+23.451653));
    }
}
