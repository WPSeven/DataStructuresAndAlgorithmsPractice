package main.java.com.waiphyothu;

import java.util.Arrays;

public class encodeArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeArray(0)));
        System.out.println(Arrays.toString(encodeArray(1)));
        System.out.println(Arrays.toString(encodeArray(-1)));
        System.out.println(Arrays.toString(encodeArray(100001)));
        System.out.println(Arrays.toString(encodeArray(999)));
    }

    static int[] encodeArray(int n){
        if (n == 0)
            return new int[]{1};

        int nCopy = n < 0 ? -n : n;
        int size = n < 0 ? 1 : 0;

        while (nCopy > 0){
            int digit = nCopy % 10;
            size += digit + 1;
            nCopy /= 10;
        }

        int[] encode = new int[size];

        nCopy = n < 0 ? -n : n;
        for( int i = 0; i < size; i++){
            if (i == 0 && n < 0){
                encode[i] = -1;
                i++;
            }

            while (nCopy > 0){
                int digit = nCopy % 10;
                size += digit + 1;
                nCopy /= 10;

                for (int j = 0; j < digit; j++){
                    encode[i] = 0;
                    i++;
                }

                encode[i] = 1;
                i++;
            }

        }

        return encode;
    }

}
