package java_basics.basic_exercises_part_I;

import java.util.Scanner;

/*
Write a Java program to swap two variables.
*/

public class Exer015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int a = sc.nextInt();

        System.out.print("Input a number: ");
        int b = sc.nextInt();

        System.out.println("Antes de trocar: " + a + ", " + b);

        int aux = a;
        a = b;
        b = aux;

        System.out.println("Depois de trocar: " + a + ", " + b);

        sc.close();
    }
}
