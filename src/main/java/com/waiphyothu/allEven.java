package main.java.com.waiphyothu;

public class allEven {


    //Solution 1:
    int allEven(int a[], int len) {
        for (int i = 0; i < len; i++) {
            if (a[i] % 2 != 0) {
                return 0; // Return immediately upon finding an odd number
            }
        }
        return 1; // Return 1 only if no odd numbers were found
    }


    //Solution 2:
    static int allEven2(int a[], int len) {
        for (int i = 0; i < len; i++) {
            if (a[i] % 2 != 0) {
                return 0; // Return immediately upon finding an odd number
            }
        }
        return 1; // Return 1 only if no odd numbers were found
    }


    //Solution 3
    static int allEven3(int a[], int len) {
        for (int i = 0; i < len; i++) {
            if (a[i] % 2 != 0) {
                return 0; // Return immediately upon finding an odd number
            }
        }
        return 1; // Return 1 only if no odd numbers were found
    }
}
