package main.java.com.waiphyothu;

public class fullnessQuotient {
    public static void main(String[] args) {
        System.out.println(fullnessQuotient(94));
        System.out.println(fullnessQuotient(1));
        System.out.println(fullnessQuotient(9));
        System.out.println(fullnessQuotient(360));
        System.out.println(fullnessQuotient(-4));
    }


    static int fullnessQuotient(int n) {
        if (n < 1) {
            return -1;
        }

        int counter = 0;
        for (int base = 2; base <= 9; base++) {
            boolean zeroFlag = false;
            int number = n;
            while (number > 0) {
                if (number % base == 0) {
                    zeroFlag = true;
                    break;
                }
                number = number / base;
            }

            if (!zeroFlag) {
                counter++;
            }

        }
        return counter;
    }
}
