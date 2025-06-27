package java_basics.basic_exercises_part_I;

/*
Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
*/

import java.util.Scanner;

public class Exer012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        double a = sc.nextDouble();
        System.out.print("Input a number: ");
        double b = sc.nextDouble();
        System.out.print("Input a number: ");
        double c = sc.nextDouble();

        double media = (a + b + c) / 3;
        System.out.println(media);

        sc.close();
    }
}
