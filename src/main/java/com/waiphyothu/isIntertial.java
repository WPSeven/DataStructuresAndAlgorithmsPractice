package main.java.com.waiphyothu;

import java.util.ArrayList;

public class isIntertial {

    public static void main(String[] args) {

        int[] array = {11, 4, 20, 9, 2, 8};
        int[] array2 = {12, 11, 4, 9, 2, 3, 10};
        int[] array3 = {11, 4, 20, 9, 2, 8, 24};
        int[] array4 = {1};
        int[] array5 = {2};
        int[] array6 = {1,2,3,4};
        int[] array7 = {1, 1, 1, 1, 1, 1, 2};
        int[] array8 = {2, 12, 4, 6, 8, 11};
        int[] array9 = {2, 12, 12, 4, 6, 8, 11};
        int[] array10 = {-2, -4, -6, -8, -11};
        int[] array11 = {2, 4, 6, 8, 10};


        System.out.println("isInertial "+isInertial(array));
    }

    static int isInertial(int[] a){

        int minOld = Integer.MAX_VALUE;
        int maxEven = Integer.MIN_VALUE;
        int secondMaxEven = maxEven;
        boolean containOdd = false;


        for (int anA : a) {
            if (anA % 2 != 0) {
                // Odd
                containOdd = true;
                if (anA < minOld) {
                    minOld = anA;
                }
            }else {
                // Even
                if (anA > maxEven) {
                    secondMaxEven = maxEven;
                    maxEven = anA;
                }else if (anA > secondMaxEven && anA < maxEven) {
                    secondMaxEven = anA;
                }
            }
        }

        if(containOdd && minOld > secondMaxEven && maxEven > minOld){
            return 1;
        }else {
            return 0;
        }


    }

    static int getMax(ArrayList<Integer> a){

        int max = a.get(0);
        for (int i = 0; i < a.size(); i++){
            if (max < a.get(i)){
                max = a.get(i);
            }
        }
        return max;

    }

    static int isInertialArray(int[] a) {
        boolean oddFlag = false;
        boolean maxEvenFlag = false;
        boolean oddGtEvenFlag = false;

        int max = Integer.MIN_VALUE;

        int largestEven = max;

        int smallestOdd = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];

            if (a[i] % 2 != 0) {
                oddFlag = true;
                if (a[i] < smallestOdd)
                    smallestOdd = a[i];
            } else if (largestEven < max)
                largestEven = a[i];

            if (max % 2 == 0)
                maxEvenFlag = true;
            else maxEvenFlag = false;

        }
        if (smallestOdd > largestEven)
            oddGtEvenFlag = true;

        System.out.println("smallestOdd = " + smallestOdd);
        System.out.println("largestEven = " + largestEven);
        ;

        System.out.println("oddFlag = " + oddFlag);
        System.out.println("maxEvenFlag = " + maxEvenFlag);
        System.out.println("oddGtEvenFlag = " + oddGtEvenFlag);

        if (oddFlag && maxEvenFlag && oddGtEvenFlag)
            return 1;
        else
            return 0;
    }

    static int isInertial1(int[] a) {
        int greatestEven1 = Integer.MIN_VALUE;
        int greatest = greatestEven1;
        int greatestEven2 = greatestEven1;
        int smallestOdd = Integer.MAX_VALUE;
        int totalOdd = 0;
        for (int number : a) {
            if (number > greatest) greatest = number;
            if (number % 2 == 0) {
                if (number > greatestEven1) {
                    greatestEven2 = greatestEven1;
                    greatestEven1 = number;
                } else if (number != greatestEven1 && number > greatestEven2) {
                    greatestEven2 = number;
                }
            } else {
                if (number < smallestOdd) smallestOdd = number;
                totalOdd++;
            }
        }
        if (greatest == greatestEven1 && smallestOdd > greatestEven2 && totalOdd > 0) return 1;
        else return 0;
    }

    static int isInertial2(int[] a) {
        boolean oddFlag = false;
        int maxEven = Integer.MIN_VALUE;
        int secondMaxEven = maxEven;
        int minOdd = Integer.MAX_VALUE;

        for (int anA : a) {
            if (anA % 2 != 0) {
                oddFlag = true;
                if (anA < minOdd)
                    minOdd = anA;
            } else {
                if (anA > maxEven) {
                    secondMaxEven = maxEven;
                    maxEven = anA;
                } else if (anA > secondMaxEven && anA < maxEven) {
                    secondMaxEven = anA;
                }
            }
        }
        if (oddFlag && minOdd > secondMaxEven && maxEven > minOdd) return 1;
        return 0;
    }
}


