package main.java.com.waiphyothu;

public class smallest {

    public static void main(String[] args) {
        System.out.println(smallest(1));
        System.out.println(smallest(2));
        System.out.println(smallest(3));
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));
    }

    private static int smallest(int n){

        int i = 1;
        while (true){
            int count = 1;
            for (int j = 1; j <= n; j++){
                if (!containTwo(i*j)){
                    break;
                }
                count++;
            }

            if (count > n){
                return i;
            }
            i++;
        }


    }

    private static boolean containTwo(int num){
        while (num > 0){
            if (num % 10 == 2){
                return true;
            }
            num = num / 10;

        }
        return false;
    }



    static int smallest2(int n) {
        int num = 1;
        while (true) {
            boolean flag = false;
            for (int i = 1; i <= n; i++) {
                flag = false;
                int product = num * i;
                while (product > 0) {
                    int digit = product % 10;
                    product /= 10;
                    if (digit == 2) {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    break;
            }
            if (flag) return num;
            num++;
        }
    }

}
