package java_basics.basic_exercises_part_I;

/*
Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output :
16
*/

import java.util.Scanner;

public class Exer003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro Num: ");
        int a = sc.nextInt();

        System.out.print("Primeiro Num: ");
        int b = sc.nextInt();

        int c = (a / b);
        System.out.println("Result: " + c);

        // Fecha Scanner
        sc.close();
    }
}
