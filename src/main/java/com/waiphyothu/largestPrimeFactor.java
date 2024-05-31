package main.java.com.waiphyothu;

public class largestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
        System.out.println(largestPrimeFactor(11));
    }

    static int largestPrimeFactor(int n){

        if (n <= 2){
            return 0;
        }

        int largestFactor = 0;
        for (int i = 2; i <= n; i++){
            if(n % i == 0 && isPrime(i)){
                largestFactor = i;
            }
        }

        return largestFactor;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return n > 0;
    }
}
