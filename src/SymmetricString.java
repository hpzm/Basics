import java.util.Scanner;

public class SymmetricString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个对称字符串：");
        String s=sc.nextLine();

        StringBuilder sb=new StringBuilder(s);
        String result=sb.reverse().toString();

        if(s.equals(result)){
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }
    }
}
