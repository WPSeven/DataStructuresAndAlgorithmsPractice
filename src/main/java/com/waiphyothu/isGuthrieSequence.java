package main.java.com.waiphyothu;

public class isGuthrieSequence {
    public static void main(String[] args) {

        System.out.println(" - "+isGuthrieSequence(new int[]{7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1}));
        System.out.println(" - "+isGuthrieSequence(new int[]{8, 4, 2, 1}));
        System.out.println(" - "+isGuthrieSequence(new int[]{8, 17, 4, 1}));
        System.out.println(" - "+isGuthrieSequence(new int[]{8, 4, 1}));
        System.out.println(" - "+isGuthrieSequence(new int[]{8, 4, 2}));

    }

    static int isGuthrieSequence(int[] a){

        if (a[a.length - 1] != 1){
            return 0;
        }


        for (int i = 0; i < a.length - 1; i++){
            if (a[i]%2 == 0){
                // Even
                if (a[i]/2 != a[i+1]){
                    return 0;
                }
            }else {
                //Odd
                if (a[i] * 3 + 1 != a[i+1]){
                    return 0;
                }
            }
        }
        return 1;
    }

}
