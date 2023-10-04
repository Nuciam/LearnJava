package org.example.Lec02;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please input value of name: " );
        String name = scanner.nextLine();
        //standard input - keyboard
        //standard output - ის რაც კონსოლში იწერება, monitor
        //err - შეცდომები

        switch (name) {
            case "nucia":
                System.out.println("Nuca Matcharidze");
                break;
            case "abula":
                System.out.println("Luka abulashvili");
                break;
            default:
                System.out.println("vigaca yle");
        }
    }
}
