package java_basics.basic_exercises_part_I;

import java.util.Scanner;

/*
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/

public class Exer006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int a = sc.nextInt();

        System.out.print("Input second number: ");
        int b = sc.nextInt();

        int soma = a + b;
        int sub = a - b;
        int multi = a * b;
        int divisao = a / b;
        int modulo = a % b; // Sobra de uma divisao (modulo)

        System.out.println(a + " + " + b + " = " + soma);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " x " + b + " = " + multi);
        System.out.println(a + " / " + b + " = " + divisao);
        System.out.println(a + " mod " + b + " = " + modulo);


        sc.close();
    }
}
