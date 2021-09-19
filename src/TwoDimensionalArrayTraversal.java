public class TwoDimensionalArrayTraversal {
    public static void main(String[] args) {
        int[] arr1={11,22,33};
        int[] arr2={55,66,77};

//        int[][] arr={arr1,arr2};
        int[][] arr={{11,22,33},{55,66,77}};

        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
                sum +=arr[i][j];
            }
        }

        System.out.println("sum:"+sum);

    }
}
