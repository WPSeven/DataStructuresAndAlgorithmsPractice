public class primeCount {
    public static int primeCount(int start, int end) {
        if (end == 1) {
            return 0;
        }
        if (start < 1) {
            start = 2;
        }
        int result = 0;
        for (; start <= end; start++) {
            boolean isPrime = true;
            for (int i = 2; i < start; i++) {
                if (start % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result++;
            }
        }
        return result;
    }

    static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    static int calculatePrimeCount(int start, int end){
        if(start > end) return 0;
        if(start < 2) start = 2;
        int count = 0;
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                count++;
                System.out.println("this is prime = "+i);
            }
        }
        return count;
    }

    public static void main(String[] args){

        int primeCount = primeCount(-10, 6);
        System.out.println("Prime Count " + primeCount);
        System.out.println("Result: " + calculatePrimeCount(-10, 6));
    }
}