package example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        findPrefixSum();


//        System.out.println(findGasStation(new int[]{0}, new int[]{0}));
//        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));

        int ar[] = {2, 3, 5, 4, 5, 3, 4};
        int n = ar.length;
        System.out.println("Element occurring once is " +
                findSingle(ar, n) + " ");

//        int arr[] = { 12, 13, 1, 10, 34, 1 };
//        int n = arr.length;
//        print3largest(arr, n);
//        minimumTotal(Arrays.asList(Arrays.asList(2), Arrays.asList(3, 4), Arrays.asList(6, 5, 7), Arrays.asList(4, 1, 8, 3)));
    }


    public static void findPrefixSum() {
        int[] arr = {3, 2, 1, 5, 4};


        System.out.println("Before prefix sum - " + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        System.out.println("After prefix sum - " + Arrays.toString(arr));
    }

    public static int findGasStation(final int[] arrA, final int[] arrB) {
        int sumA = Arrays.stream(arrA).sum();
        int sumB = Arrays.stream(arrB).sum();

        if (sumA < sumB) {
            System.out.println(sumA + "--" + sumB);
            return -1;
        }

        int result = 0;
        int sumOfDiff = 0;
        int i = 0;
        while (i < arrA.length) {

            sumOfDiff += arrA[i] - arrB[i];
            if (sumOfDiff < 0) {
                sumOfDiff = 0;
                i++;
            } else {
                return i;
            }

        }


        return result;

    }

    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;

        int[] result = new int[2];
        while (i < nums.length) {
            int sum = 0;
            if (i != j) {
                sum = nums[i] + nums[j];
            }
            if (sum != target) {
                if (j < nums.length - 1) {
                    j++;
                } else {
                    i++;
                    j = 0;
                }
            } else {
                result[0] = i;
                result[1] = j;
                return result;
            }
        }
        return result;
    }

    static int findSingle(int ar[], int ar_size) {
        // Do XOR of all elements and return
        int res = ar[0];
        for (int i = 1; i < ar_size; i++) {
            System.out.print("XOR of value " + res + " ^ " + ar[i]);
            res = res ^ ar[i];
            System.out.print(" is -> " + res + "\n");
        }

        return res;
    }

    static void print3largest(int arr[], int arr_size) {
        int i, first, second, third;

        /* There should be atleast three elements */
        if (arr_size < 3) {
            System.out.print(" Invalid Input ");
            return;
        }

        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            /* If current element is greater than
            first*/
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }

            /* If arr[i] is in between first and
            second then update second  */
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third)
                third = arr[i];
        }

        System.out.println("Three largest elements are " + first + " " + second + " " + third);
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        List<int[]> ways = new ArrayList<>();
        int capacity = 3;
        int[] tmp;
        ways.add(new int[]{Integer.MAX_VALUE, triangle.get(0).get(0), Integer.MAX_VALUE});
        for (int i = 1; i < triangle.size(); i++) {
            capacity++;
            tmp = new int[capacity];
            tmp[0] = Integer.MAX_VALUE;
            tmp[capacity - 1] = Integer.MAX_VALUE;
            for (int j = 1; j < capacity - 1; j++)
                tmp[j] = (Math.min(ways.get(i - 1)[j - 1], ways.get(i - 1)[j]) + triangle.get(i).get(j - 1));
            ways.add(tmp);
        }
        int min = ways.get(ways.size() - 1)[1];
        for (Integer num : ways.get(ways.size() - 1))
            min = Math.min(min, num);
        return min;
    }

}