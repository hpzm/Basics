import java.util.Scanner;

public class TraversalString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String s=sc.nextLine();

        char[] c=s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

//        for (int i = 0; i < s.length(); i++) {
//            char c=s.charAt(i);
//            System.out.println(c);
//        }
    }
}
