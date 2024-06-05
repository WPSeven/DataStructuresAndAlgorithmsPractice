package main.java.com.example;

public class Main {

    public static void main(String[] args) {
	// main.java.com.example.Main Runner

        primeCount primeCount = new primeCount();

        int ans = primeCount.primeCount(-10, 6);

        System.out.println("Prime Count " + ans);

        System.out.println(12 / 10);
        System.out.println(12 / 20);
        System.out.println(12f / 20f);
        System.out.println(12 % 20);



        // Integer concatenate
        int[] nums = {1, 0, 2, 2, 1};
        int retval = 0;
        for (int digit : nums)
        {
            retval *= 10;
            retval += digit;
        }
        System.out.println("Return value is: " + retval);



        //Hint: In integer arithmetic, (6/4) * 4 = 4
        System.out.println((6/4) * 4);
        System.out.println((6/5) * 5);
        System.out.println((8/5) * 5);

    }
}
