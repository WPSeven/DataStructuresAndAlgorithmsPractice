package main.java.com.waiphyothu;

public class isLegalNumber {
    public static void main(String[] args) {
        System.out.println(isLegalNumber(new int[]{3, 2, 1},  4));
        System.out.println(isLegalNumber(new int[]{3, 7, 1},  6));
    }

    public static int isLegalNumber(int[ ] a, int base){
        if (a[0] == 0){
            return 0;
        }

        for (int aAn : a){
            if (aAn >= base){
                return 0;
            }
        }
        return 1;
    }
}
