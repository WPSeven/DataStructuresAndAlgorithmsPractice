package main.java.com.waiphyothu;

public class is235Array {



    public static void main(String[] args) {
        System.out.println(is235Array(new int[]{2, 3, 5, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 6, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(is235Array(new int[]{2, 4, 8, 16, 32}));
        System.out.println(is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
        System.out.println(is235Array(new int[]{7, 11, 77, 49}));
        System.out.println(is235Array(new int[]{2}));
        System.out.println(is235Array(new int[]{}));
        System.out.println(is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));
    }

    static int is235Array(int[] a) {
        int divisibleBy2 = 0;
        int divisibleBy3 = 0;
        int divisibleBy5 = 0;

        int notDivisible = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 || a[i] % 3 == 0 || a[i] % 5 == 0) {
                if (a[i] % 2 == 0)
                    divisibleBy2++;
                if (a[i] % 3 == 0)
                    divisibleBy3++;
                if (a[i] % 5 == 0)
                    divisibleBy5++;
            } else {
                notDivisible++;
            }
        }

        if (divisibleBy2 + divisibleBy3 + divisibleBy5 + notDivisible == a.length)
            return 1;
        return 0;
    }




    public static int is235Array2(int[] arr) {
        int countDivBy2 = 0;
        int countDivBy3 = 0;
        int countDivBy5 = 0;
        int countNotDivBy235 = 0;

        for (int num : arr) {
            boolean divisible = false;
            if (num % 2 == 0) {
                countDivBy2++;
                divisible = true;
            }
            if (num % 3 == 0) {
                countDivBy3++;
                divisible = true;
            }
            if (num % 5 == 0) {
                countDivBy5++;
                divisible = true;
            }
            if (!divisible) {
                countNotDivBy235++;
            }
        }

        int totalCount = countDivBy2 + countDivBy3 + countDivBy5 + countNotDivBy235;
        return totalCount == arr.length ? 1 : 0;
    }
}


