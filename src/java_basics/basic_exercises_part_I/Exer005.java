package java_basics.basic_exercises_part_I;
/*
Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
*/

import java.util.Scanner;

public class Exer005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Num 1: ");
        int a = sc.nextInt();

        System.out.print("Num 2: ");
        int b = sc.nextInt();

        int c = a * b;
        System.out.println("Result: " + c);


        sc.close();
    }
}
