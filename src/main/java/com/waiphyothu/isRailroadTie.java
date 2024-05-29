package main.java.com.waiphyothu;

public class isRailroadTie {
    public static void main(String[] args) {
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 3, -18, 0, 2, 2})); //t
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 0, 2, 2}));
        System.out.println(isRailroadTie(new int[]{0, 1, 2, 0, 3, 4}));
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isRailroadTie(new int[]{1}));
        System.out.println(isRailroadTie(new int[]{}));
        System.out.println(isRailroadTie(new int[]{0}));
        System.out.println(isRailroadTie(new int[]{1, 2}));
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));//t
        System.out.println(isRailroadTie(new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3}));//t
        System.out.println(isRailroadTie(new int[]{0, 0, 0, 0}));
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(isRailroadTie(new int[]{1, 3, 0, 3, 5, 0}));
    }

    static int isRailroadTie(int[] a) {
        if (a.length <= 1 || a[0] == 0 || a[(a.length - 1)] == 0)
            return 0;

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] != 0 && ((a[i + 1] != 0 && a[i - 1] != 0) || (a[i + 1] == 0 && a[i - 1] == 0))) {
                return 0;
            } else if (a[i] == 0 && (a[i - 1] == 0 || a[i + 1] == 0)) {
                return 0;
            }

        }
        return 1;
    }



    static int isRailroadTie2(int[] a) {
        // Check if array length is less than or equal to 1, or the first or last element is zero
        if (a.length <= 1 || a[0] == 0 || a[a.length - 1] == 0) {
            return 0;
        }

        // Iterate through the array from the second element to the second-to-last element
        for (int i = 1; i < a.length - 1; i++) {
            // Check conditions for non-zero elements
            if (a[i] != 0) {
                boolean hasNonZeroNeighbors = (a[i - 1] != 0 && a[i + 1] != 0);
                boolean hasZeroNeighbors = (a[i - 1] == 0 && a[i + 1] == 0);
                if (hasNonZeroNeighbors || hasZeroNeighbors) {
                    return 0;
                }
            }
            // Check conditions for zero elements
            else if (a[i] == 0) {
                boolean hasTwoNonZeroNeighbors = (a[i - 1] != 0 && a[i + 1] != 0);
                if (!hasTwoNonZeroNeighbors) {
                    return 0;
                }
            }
        }

        return 1;
    }


}
