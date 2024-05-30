package main.java.com.waiphyothu;

public class is121Array {
    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
    }

    static int is121Array(int[] a) {
        int totalStart1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                totalStart1++;
            } else {
                break;
            }
        }

        int totalEnd1 = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == 1) {
                totalEnd1++;
            } else {
                break;
            }
        }

        int total2 = 0;
        for (int i = totalStart1; i < a.length - totalStart1; i++) {
            if (a[i] != 2) {
                return 0;
            }else {
                total2++;
            }
        }


        if (totalStart1 != totalEnd1 || totalStart1 == 0 || total2 == 0) {
            return 0;
        }




        return 1;
    }


}
