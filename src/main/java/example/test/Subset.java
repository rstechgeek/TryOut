package example.test;

public class Subset {
    public static void main(String[] args) {
        checkLeftShiftOperator(new int[]{1, 2, 3,4});

    }

    public static void checkLeftShiftOperator(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < (1 << size); i++) {
//            System.out.println(i + " --> " + (1 << size));
//            System.out.println("Binary i " + Integer.toBinaryString(i) + " --> " + Integer.toBinaryString(1 << size));
            for (int j = 0; j < size; j++) {

                if ((i & (1 << j)) != 0) {
//                    System.out.println(i + " & " + (1 << j));
//                    System.out.println("Binary j " + Integer.toBinaryString(i) + " --> " + Integer.toBinaryString(1 << j));
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void findSubset(int pos, int len, int[] subset) {

//       if(pos == )
    }
}
