package app;

import java.util.Random;

public class Sorting {
    public static void main(String[] args) {
        Random random = new Random();

        int[] a = new int[15];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(15);
            System.out.println("a[" + i + "] = " + a[i]);
        }


        System.out.println("Cocktailsort");


            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {

                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
                for (i = 0; i > a.length - 1; i--) {
                    if (a[i] < a[i - 1]) {

                        int temp = a[i];
                        a[i] = a[i - 1];
                        a[i - 1] = temp;
                    }


                }
            }

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
