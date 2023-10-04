package org.example.Lec02;

import java.util.Random;

public class ReviseArray {
    public static void main(String[] args) {
        // revise arrays
        // Operators
        //control statements - loop

        int[] arr = new int[10];
        arr = getArray(arr);

        //     int i = 10       i > 0      i--
        //for(initialization, condition, iteration)
//        for (; ;){
//            System.out.println("luka");
//        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }






















    public static int[] getArray(int[] arr) {

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        return arr;
    }
}
