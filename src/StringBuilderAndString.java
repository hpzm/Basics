public class StringBuilderAndString {
    public static void main(String[] args) {
        StringTest(); //1122ms
        StringBuilderTest(); //6ms
    }

    public static void StringTest(){
        long start=System.currentTimeMillis();

        String s="";
        for (int i=1;i<=50000;i++){
            s += i;
        }

        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void StringBuilderTest(){
        long start=System.currentTimeMillis();

        StringBuilder sb=new StringBuilder();
        for (int i=1;i<=50000;i++){
            sb.append(i);
        }

        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
