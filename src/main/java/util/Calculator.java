package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Calculator {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


    public int method1() throws IOException {
        System.out.println("Enter length of array:");
        String strLength = bufferedReader.readLine();
        int length = Integer.parseInt(strLength);
        return length;
    }

    public int[] method2(int lengthArray) throws IOException {
        int[] array = new int[lengthArray];
        for(int i = 0; i < lengthArray; i++){
            System.out.println("Enter " + i + "-th element of array");
            String strNum = bufferedReader.readLine();
            array[i] = Integer.parseInt(strNum);
        }
        return array;
    }

    public int method3(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public int method4(int[] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public int method5(int[] array){
        return this.getRepetedByCounter(array);
    }


    /*********************
     * **********************
     **************************/




    public int getRepeted(int[] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 5){
                list.add(arr[i]);
            }
        }
        return list.size();
    }


    public int getRepetedByCounter(int[] arr){
        int counter = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i] == 5){
                counter++;
            }
        }
        return counter;
    }
}
