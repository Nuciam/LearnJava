package org.example.Lec01;

import java.util.Random;

public class LearnArrays {
    public static void main(String[] args) {
        //როდესაც თავიდან გამოვაცხადებთ array ყველა ტიპი უნდა იყოს ერთი და იგივე
        int [] variable = new int[8];

        variable[0] = 2;// ამ შემთხვევაში array ელემენტი წარმოდგენილია როგორც int
        variable[1] = 32;
        variable[2] = 45;
        variable[3] = 12;
        variable[4] = 3;
        variable[5] = 5;
        variable[6] = 8;
        variable[7] = 9;

//        System.out.println(variable.length);
//        System.out.println();
//
//        for (int i = 0; i < variable.length; i++) {
//            System.out.println(variable[i]);
//        }

       int[][] arr1 = new int[7][5];
//        arr1[0] = new int[4]; //ამ შემთხვევაში array თითოეული ელემენტი წარმოდგენილია როგორც array
//        arr1[0][0] = 15;

        //array
        /*

        [[][][][][][]] ----- 0
        [[][][][][][]] ----- 1

        [0,0][0,1][0,2][][][][][][]
        [1,0][1,1][1,2][][][][][][]
        [][][][][][][][][]
        [][][][][][][][][]
        [][][][][][][][][]


        [2] -
        [32] -
        [45] -
        [12] -
        [3] -
        [5] -
        [8] -
        [9] -
         */
        // 2, 32, 45, 12, 3, 5, 8, 9
        System.out.println(arr1.length);

        System.out.println();

        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print("[ " + arr1[i][j] + " ] ");
            }
            System.out.println(" }");
        }
    }
}
