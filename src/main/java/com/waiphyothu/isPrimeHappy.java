package main.java.com.waiphyothu;

public class isPrimeHappy {
    public static void main(String[] args) {
        System.out.println(isPrimeHappy(5));
        System.out.println(isPrimeHappy(25));
        System.out.println(isPrimeHappy(32));
        System.out.println(isPrimeHappy(8));
        System.out.println(isPrimeHappy(2));
    }


    static int isPrimeHappy(int n){

        int sum = 0;
        boolean isSmallerPrime = false;
        for( int i = 2; i < n; i++){ //
            if (isPrime(i)){
                isSmallerPrime = true;
                sum += i;
            }
        }

        if (isSmallerPrime && sum % n == 0){
            return 1;
        }
        return 0;
    }


    static int isPrimeHappy2(int n) {
        int number = 2;
        boolean primeFlag = false;
        int sum = 0;
        while (number < n) {
            if (isPrime(number)) {
                primeFlag = true;
                sum += number;
            }
            number++;
        }
        if (primeFlag && sum % n == 0)
            return 1;
        else return 0;
    }

    static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return n > 0;
    }

}
