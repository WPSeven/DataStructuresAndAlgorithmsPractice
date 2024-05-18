package main.java.com.waiphyothu;

public class isSquare {
    public static void main(String[] args) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));

        System.out.println(isSquare(0));
    }


    static int isSquare7(int n) {

        for (int i = 0; i <= n; i++) {
            if (i * i == n) {
                return 1;
            }
        }

        return 0;

    }
    public static int isSquare2(int n) {
        if (n < 0)
            return 0;

        int square = 0;
        int number = 1;

        while (square < n) {
            square = number * number;
            number++;
        }

        if (square == n)
            return 1;

        return 0;
    }


    public static int isSquare1(int n) {

        if (n < 0) return 0;

        float root = 1.0f;

        for (int i = 0; i < n; i++) {
            root = 0.5f * (root + (n / root));
        }

        if (root == (int) root) return 1;
        else return 0;
    }

    public static int isSquare(int n) { //4
        if (n < 0)
            return 0;

        int square = 0;
        int number = 1;

        while (square < n) {
            square = number * number;
            number++;
        }

        if (square == n)
            return 1;

        return 0;
    }
}
