package main.java.com.waiphyothu;

public class isStacked {
    public static void main(String[] args) {
        System.out.println(isStacked(1));
        System.out.println(isStacked(3));
        System.out.println(isStacked(6));
        System.out.println(isStacked(10));
        System.out.println(isStacked(15));
        System.out.println(isStacked(7));
        System.out.println(isStacked(8));
        System.out.println(isStacked(9));
    }

    static int isStacked(int n){
        int stackedNum = 0;
        int i = 1;
        while (stackedNum < n){
            stackedNum += i++;
            if (stackedNum == n){
                return 1;
            }
        }
        return 0;
    }
}
