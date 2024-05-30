package main.java.com.waiphyothu;

public class getExponent {
    public static void main(String[] args) {
        System.out.println(getExponent(162, 3));  // Output: 4
        System.out.println(getExponent(280, 7));  // Output: 1
        System.out.println(getExponent(-250, 5));  // Output: 3
    }

    public static int getExponent(int n, int p) {
        if (p <= 1) {
            return -1; // The base p should be greater than 1
        }

        int exponent = 0;

        while (n % p == 0) {
            n /= p;
            exponent++;
        }

        return exponent;
    }


    static int getExponent2(int n, int p){
        if( p <= 1){
            return -1;
        }

        n =  n > 0? n : -n; // need coz while n>0

        int count = 0;
        while( n > 0){
            if(n % p == 0){
                count ++;
                n = n / p;
            }else {
                break;
            }
        }

        return count;
    }

}
