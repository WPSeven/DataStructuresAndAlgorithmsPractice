package main.java.com.waiphyothu;

public class isMadhavArray {

    public static void main(String[] args){

        int[] array1 = new int[]{3, 1, 2, 3, 0, 0,} ;
        int[] array2 = new int[]{2, 1, 1};
        int[] array3 = new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0, 2,2,0,1,1} ;
        int[] array4 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1} ;
        int[] array5 = new int[]{3, 1, 2, 3, 0};
        int[] array6 = new int[]{-6, -3, -3, 8, -5, -4};
        int[] array7 = new int[]{18, 9, 10, 6, 6, 6};


        System.out.println("isMadhavArray " +  isMadhavArray(array3));
    }

    public static int isMadhavArray(int[] a){

        //check Madhav array length  n*(n+1)/2 eg 6 => 21
        int n = 2;
        boolean correctArrayLength = false;

        while(n*(n+1)/2 <= a.length){

            if (n * (n + 1) / 2 == a.length) {
                correctArrayLength = true;
                break;
            }

            n ++;
        }

        System.out.println("Correct Array Length "+ correctArrayLength);

        if (!correctArrayLength){
            return 0;
        }

        /*
        a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
        * */

        int num = 2;
        for (int i = 1; i < a.length;){
            int sum = 0;
            for(int j = i; j < num + i; j++){
                sum += a[j];
            }

            if (a[0] != sum){
                return 0;
            }

            i += num++;
        }

        return 1;
    }

}
