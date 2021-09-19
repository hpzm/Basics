import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("test");
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("test");
        arrayList.add("test");

        for (int i = 0; i < arrayList.size(); i++) {
            String s=arrayList.get(i);
            if("test".equals(s)){
                arrayList.remove(i);
                i--;
            }
        }
        System.out.println(arrayList);
    }
}
