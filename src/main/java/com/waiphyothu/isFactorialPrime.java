package main.java.com.waiphyothu;

public class isFactorialPrime {

    public static void main(String[] args) {

        System.out.println(isFactorialPrime(2));
        System.out.println(isFactorialPrime(3));
        System.out.println(isFactorialPrime(7));
        System.out.println(isFactorialPrime(8));
        System.out.println(isFactorialPrime(11));
        System.out.println(isFactorialPrime(721));


    }

    static int isFactorialPrime(int n){

        if (isPrime(n)){
            for (int i = 0; i < n; i++){
                if (recursiveFactorial(i) + 1 == n){
                    return 1;
                }
            }
        }
        return 0;
    }


    static int isFactorialPrime2(int n) {
        if (isPrime(n)) {
            int sum = 0;
            for (int i = 1; i < n && sum < n; i++) {
                sum = recursiveFactorial(i) + 1;
            }

            if (sum == n) return 1;
            else return 0;
        }
        return 0;
    }

    public static int recursiveFactorial(int num){

        //base case or breaking condition.
        if (num == 0){
            return 1;
        }

        return num *recursiveFactorial(num -1);

    }

    private static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
