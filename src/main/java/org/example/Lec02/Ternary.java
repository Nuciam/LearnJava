package org.example.Lec02;

public class Ternary {
    public static void main(String[] args) {

        //********** ternary *************
        int i = 5;
        int b = i > 5 ? 7 : 11;
        System.out.println(b);
        //int b = i > 5 ? 7 : 11;
        if (i > 5) {
            b = 7;
        }
        else {
            b = 11;
        }

    }
}
