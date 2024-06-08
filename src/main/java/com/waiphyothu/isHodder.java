package main.java.com.waiphyothu;

public class isHodder {

    public static void main(String[] args) {
        System.out.println(isHodder(3));   // Output: 1
        System.out.println(isHodder(7));   // Output: 1
        System.out.println(isHodder(31));  // Output: 1
        System.out.println(isHodder(127)); // Output: 1
        System.out.println(isHodder(10));  // Output: 0
        System.out.println(isHodder(15));  // Output: 0
        System.out.println(isHodder(2));   // Output: 0

    }

    static int isHodder(int n){
        if (n <= 1) {
            return 0;
        }

        if (!isPrime(n)) {
            return 0;
        }


        for (int j = 2; ; j++) {
            int powerOfTwoMinusOne = (1 << j) - 1; // 1 << j is equivalent to 2^j
            if (powerOfTwoMinusOne == n) {
                return 1;
            } else if (powerOfTwoMinusOne > n) {
                break;
            }
        }


        return 0;
    }

    private static boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
