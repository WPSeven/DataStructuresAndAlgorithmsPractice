package main.java.com.waiphyothu;

import java.util.HashSet;
import java.util.Set;

public class isTrivalent {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE; // 2147483647
        int min = Integer.MIN_VALUE; // -2147483648

        int result = max + 1; // This causes overflow and result becomes -2147483648
        System.out.println(result);

        System.out.println(isTrivalent(new int[]{22, 19, 10, 10, 19, 22, 22, 10}));
        System.out.println(isTrivalent(new int[]{1, 2, 2, 2, 2, 2, 2}));
        System.out.println(isTrivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));
        System.out.println(isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println(isTrivalent(new int[]{}));
        System.out.println(isTrivalent(new int[]{2147483647, -1, -1, -2147483648}));
    }

    static int isTrivalent7(int[ ] a){
        if (a.length < 3){
            return 0;
        }
        Set<Integer> tri = new HashSet<Integer>();
        for(int anA : a){
            tri.add(anA);
        }
        if (tri.size() == 3){
            return 1;
        }
       return 0;
    }


    static int isTrivalent(int[] a) {

        int[] tempArray = new int[a.length];
        for (int i = 0; i < tempArray.length; i++)
            tempArray[i] = Integer.MIN_VALUE;

        int index = 0;
        for (int anA : a) {
            boolean flag = true;
            for (int k = 0; k < index; k++) {
                if (tempArray[k] == anA) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }

            if (flag) {
                tempArray[index] = anA;
                index++;
            }
        }

        if (index != 3) return 0;
        else return 1;
    }

}
