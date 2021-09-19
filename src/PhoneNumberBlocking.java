import java.util.Scanner;

public class PhoneNumberBlocking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入手机号：");
            String strPhone = sc.nextLine();
            if (strPhone.length() > 0 && strPhone.length() < 12) {
                String start = strPhone.substring(0, 3);
                String end = strPhone.substring(7);
                System.out.println("处理后为：" + start + "****" + end);
                break;
            } else {
                System.out.println("输入的手机号格式有误！");
            }
        }
    }
}
