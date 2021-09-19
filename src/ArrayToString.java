public class ArrayToString {
    public static void main(String[] args) {
        int[] intArray={1,2,3};
        String stringArray=arrToString(intArray);
        System.out.println(stringArray);
    }

    public static String arrToString(int[] intArray){
        StringBuilder sb=new StringBuilder("[");
        for (int i = 0; i < intArray.length; i++) {
            if(i==intArray.length-1){
                sb.append(intArray[i]).append("]");
            }else {
                sb.append(intArray[i]).append(",");
            }
        }

        String result=sb.toString();
        return result;
    }
}
