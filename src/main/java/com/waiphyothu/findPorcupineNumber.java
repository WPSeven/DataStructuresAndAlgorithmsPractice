package main.java.com.waiphyothu;

public class findPorcupineNumber {

    public static void main(String[] args) {

        System.out.println(findPorcupineNumber3(139));
    }

    static int findPorcupineNumber3(int n){
        int num = n +1;
        while (true){
            if (isPrime(num) && num % 10 ==9){
                int nextNum = num +1;
                while (!isPrime(nextNum)){
                    nextNum++;
                }

                if (nextNum % 10 == 9){
                    return num;
                }
            }
            num++;
        }
    }


    public static int  findPorcupineNumber2(int n){
        int num = n + 1;
        while (true) {
            if (isPrime(num) && num % 10 == 9) {
                //current one is prince and end with zero
                int nextNum = num + 1;
                //find next prime
                while (!isPrime(nextNum)) {
                    nextNum += 1;
                }
                //and then check is end with 9
                if (nextNum % 10 == 9) return num;
            }
            num++;
        }


    }

    static int findPorcupineNumber(int n) {
        for (int i = n + 1; n < Integer.MAX_VALUE; i++) {
            if (isPrime(i)) {
                int rem1 = i % 10;
                if (rem1 == 9) {
                    for (int j = i + 1; j < Integer.MAX_VALUE; j++) {
                        if (isPrime(j)) {
                            int rem2 = j % 10;
                            if (rem2 == 9)
                                return i;
                            else {
                                i = j;
                                break;
                            }
                        }
                    }
                }
            }
        }

        return 0;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return n > 1;
    }
}
