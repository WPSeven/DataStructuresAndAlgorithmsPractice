package main.java.com.example;

public class largestAdjacentSum {

    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[]{1, 2, 3, 4}));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1}));
    }

    static int largestAdjacentSum(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] > sum) {
                sum = a[i] + a[i + 1];
            }
        }
        return sum;
    }


    public int largestAdjacentSum2(int[] a) {
        int largestSum = a[0] + a[1];
        if (a.length < 2) {
            return Integer.MIN_VALUE;
        } else if (a.length == 2) {
            return largestSum;
        }
        for (int i = 2; i < a.length; i++) {
            largestSum = (largestSum < a[i - 1] + a[i]) ? a[i - 1] + a[i] : largestSum;
        }
        return largestSum;
    }
}
