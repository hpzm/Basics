import java.util.Scanner;

public class TMDShielding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入聊天内容");
        String str=sc.nextLine();
        String result=str.replace("TMD","***");
        System.out.println(result);
        //例句：你TMD是个天才！
    }
}
