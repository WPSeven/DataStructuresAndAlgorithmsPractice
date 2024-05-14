package main.java.com.waiphyothu;

import static main.java.com.example.primeCount.calculatePrimeCount;
import static main.java.com.example.primeCount.primeCount;

public class primeCount {

    /*
    1. Write a function named primeCount with signature
    int primeCount(int start, int end);
    The function returns the number of primes between start and end inclusive. Recall that a prime is
    a positive Examples
    * */

    public static void main(String[] args){

        int primeCount = primeCount(-10, 6);
        System.out.println("Prime Count " + primeCount);
    }

    //
    //Factors are the numbers that we multiply together to get another number

    public static int primeCount(int start, int end){

        if (end == 0){
            return 0;
        }

        if (start < 1){
            start = 2;
        }

        int totalPrime = 0;

        for (; start < end; start++){
            boolean isPrime = true;

            for (int i = 2; i < start; i++){
                if (start % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                totalPrime++;
            }

        }

        return totalPrime;
    }

    private static boolean isPrime(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
