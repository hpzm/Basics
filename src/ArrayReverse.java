public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr={11,22,33,44};
        for (int start=0,end=arr.length-1;start<end;start++,end--){
            arr[start]=arr[start]^arr[end];
            arr[end]=arr[start]^arr[end];
            arr[start]=arr[start]^arr[end];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
