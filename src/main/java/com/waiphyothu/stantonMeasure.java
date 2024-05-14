package main.java.com.waiphyothu;

public class stantonMeasure {

    public static void main(String[] args) {
        System.out.println(" "+ stantonMeasure(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));
        System.out.println(" "+ stantonMeasure(new int[]{1, 4, 3, 2, 1, 2, 3, 2}));
        System.out.println(" "+ stantonMeasure(new int[]{1}));
        System.out.println(" "+ stantonMeasure(new int[]{0}));
        System.out.println(" "+ stantonMeasure(new int[]{3, 1, 1, 4}));
    }

    static int stantonMeasure2(int[] a) {

        int oneCount=0;
        int stantonMeasure = 0;

        for (int anA : a) {
            if (anA == 1) {
                oneCount++;
            }
        }

        for (int anA : a) {
            if (anA == oneCount)
                stantonMeasure++;
        }

        return stantonMeasure;
    }

    static int stantonMeasure(int[] a){
        int total1 = 0;

       for (int i = 0; i < a.length; i++){
           if(a[i] == 1){
               total1++;
           }
       }
       int value = 0;
       for (int j = 0; j < a.length; j++){
           if (a[j] == total1){
               value++;
           }
       }
       return value;
    }
}
