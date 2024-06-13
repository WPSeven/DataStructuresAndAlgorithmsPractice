package main.java.com.waiphyothu;

public class equivalentArrays {

    public static void main(String[] args) {
        System.out.println(equivalentArrays(new int[] {0, 1, 2}, new int[] {2, 0, 1}));
        System.out.println(equivalentArrays(new int[] {0, 1, 2, 1}, new int[] {2, 0, 1}));
        System.out.println(equivalentArrays(new int[] {2, 0, 1}, new int[] {0, 1, 2, 1}));
        System.out.println(equivalentArrays(new int[] {0, 5, 5, 5, 1, 2, 1}, new int[] {5, 2, 0, 1}));
        System.out.println(equivalentArrays(new int[] {5, 2, 0, 1}, new int[] {0, 5, 5, 5, 1, 2, 1}));

        System.out.println(equivalentArrays(new int[] {0, 2, 1, 2}, new int[] {3, 1, 2, 0}));
        System.out.println(equivalentArrays(new int[] {3, 1, 2, 0}, new int[] {0, 2, 1, 0}));
        System.out.println(equivalentArrays(new int[] {1, 1, 1, 1, 1, 1}, new int[] {1, 1, 1, 1, 1, 2}));
        System.out.println(equivalentArrays(new int[] {}, new int[] 	{3, 1, 1, 1, 1, 2}));
        System.out.println(equivalentArrays(new int[] {}, new int[] 	{}));
    }

    static int equivalentArrays(int[ ] a1, int[ ] a2){


        for(int i = 0; i < a1.length; i++){
            boolean contain = false;
            for(int j = 0; j < a2.length; j++){
                if(a1[i] == a2[j]){
                    contain = true;
                    break;
                }
            }

            if(!contain) return 0;
        }

        for(int i = 0; i < a2.length; i++){
            boolean contain = false;
            for(int j = 0; j < a1.length; j++){
                if(a2[i] == a1[j]){
                    contain = true;
                    break;
                }
            }

            if(!contain) return 0;
        }

        return 1;

    }



    static boolean isContain(int n, int[] a){
        for (int anA : a){
            if (anA == n){
                return true;
            }
        }
        return false;
    }



}
