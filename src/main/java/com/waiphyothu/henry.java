package main.java.com.waiphyothu;

public class henry {

    public static void main(String[] args) {

      // A perfect number is one that is the sum of its factors, excluding itself.\
        System.out.println("perfectNumber "+perfectNumber(3));

        System.out.println(henry(1,3)); // 1st perfect 6 + 3nd perfect 496

    }

    static int henry(int i, int j){
        return perfectNumber(i) + perfectNumber(j);
    }

    static int perfectNumber(int i){

        int count = 0;
        int n = 1;
        while (true){
            if(isPerfectNumber(n)){
                count ++;
                if (count == i){
                    return n;
                }
            }
            n++;
        }
    }

    static boolean isPerfectNumber(int n){
        if (n <= 1) {
            return false;  // There are no perfect numbers less than 2
        }

        int sum = 0;
        for(int i = 1; i < n; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        return sum == n;
    }


    public static int henry2(int i, int j) {
        if(i < 0 || j <0) {
            return 0;
        }
        int counter = 1;
        int perfectSequence = 2;
        int perfectFirstValue = 0;
        int perfectSecondValue = 0;

        while(true) {
            //find the first perfect number
            int sum = 0;
            for(int k = 1 ; k < perfectSequence; k++) {
                if(perfectSequence % k == 0) {
                    sum = sum + k;
                }
            }
            if(sum == perfectSequence) {
                //yes, this is perfect number
                if(counter == i) {
                    perfectFirstValue = perfectSequence;
                }
                if (counter == j) {
                    perfectSecondValue = perfectSequence;
                }

                counter++;

            }

            if(perfectFirstValue != 0 && perfectSecondValue != 0) {
                return perfectFirstValue + perfectSecondValue;
            }
            perfectSequence++;
        }

    }


}
