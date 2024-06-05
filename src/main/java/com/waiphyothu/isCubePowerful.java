package main.java.com.waiphyothu;

public class isCubePowerful {

    public static void main(String[] args) {
        System.out.println(isCubePowerful(153)); //1
        System.out.println(isCubePowerful(370)); //1
        System.out.println(isCubePowerful(371)); //1
        System.out.println(isCubePowerful(407)); //1
        System.out.println(isCubePowerful(87)); //0
        System.out.println(isCubePowerful(0)); //0
        System.out.println(isCubePowerful(-81)); //0
    }


    static int isCubePowerful(int n) {
        if (n<=0){
            return 0;
        }
        int num = n;
        int total = 0;
        while (num > 0) {

            int digit = num % 10;

            total += digit * digit * digit;

            num = num / 10;

        }

        if (total == n)
            return 1;
        else
            return 0;
    }



    static int isCubePowerful2(int n) {
        if (n<=0)
            return 0;

        int nCopy = n;
        int sum = 0;
        while (nCopy > 0) {
            int digit = nCopy % 10;
            nCopy /= 10;
            int product = 1;

            for (int i = 1; i <= 3; i++) {
                product *= digit;
            }
            sum += product;
        }

        if (sum == n) return 1;
        return 0;
    }
}
