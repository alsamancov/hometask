package app;

import util.Calculator;

import java.io.IOException;

/**
 * Created by Alexey on 09/14/2017.
 */
public class Application {
    public static void main(String[] args) throws IOException {
        int [] b = {2,5,4,3,7,5,7,4,7,5,5,8,5,5,5,5};

        Calculator calculator = new Calculator();
        int length = calculator.method1();
        int[] array = calculator.method2(length);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int min = calculator.method3(array);
        System.out.println(min);
        int max = calculator.method4(array);
        System.out.println(max);
        int repeted = calculator.method5(array);
        System.out.println(repeted);

    }


}
