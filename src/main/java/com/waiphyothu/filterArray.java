package main.java.com.waiphyothu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filterArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(filterArray(new int[]{8, 4, 9, 0, 3, 1, 2}, 88))); //[0, 3, 2]
        System.out.println(Arrays.toString(filterArray(new int[]{18}, 3))); //null
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 0))); //[]
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 1))); //[9]
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 2))); //[-9]
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 3))); //[9, -9]
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 4))); //null
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9, 5}, 3))); //[9, -9]
        System.out.println(Arrays.toString(filterArray(new int[]{0, 9, 12, 18, -6}, 11))); //[0, 9, 18]
    }

    static int[ ] filterArray(int[ ] a, int n){
            int size = 0;
            for (int number = n; number > 0; number /= 2){
                if (number % 2 == 1){
                    size++;
                }
            }

            int [] result = new int[size];
            int i = 0;
            int index = 0;
            for (int number = n; number > 0; number /= 2){
                if (number % 2 == 1){
                    if (index >= a.length){
                        return null;
                    }
                    result[i] = a[index];
                    i++;
                }
                index++;
            }

        return result;

    }


    static int[] filterArray2(int[] a, int n) {
        if (n == 0) {
            return new int[0];
        }
        String binaryStr = Integer.toBinaryString(n);
        List<Integer> list = new ArrayList<>();
        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            if (Integer.valueOf(String.valueOf(binaryStr.charAt(i))) == 1) {
                if (a.length - 1 < (binaryStr.length() - 1 - i)) {
                    return null;
                }
                list.add(a[binaryStr.length() - 1 - i]);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
