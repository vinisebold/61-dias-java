package java_basics.basic_exercises_part_II;

/*
Write a Java program to find the value of a specified expression.

a) 101 + 0) / 3
b) 3.0e-6 * 10000000.1
c) true && true
d) false && true
e) (false && false) || (true && true)
f) (false || false) && (true && true)

Expected Output :
(101 + 0) / 3)-> 33
(3.0e-6 * 10000000.1)-> 30.0000003
(true && true)-> true
(false && true)-> false
((false && false) || (true && true))-> true
(false || false) && (true && true)-> false
*/

public class Exer151 {
    public static void main(String[] args) {

        int a = (101 + 0) / 3;
        double b = 3.0e-6 * 10000000.1;
        boolean c = true && true;
        boolean d = false && true;
        boolean e = (false && false) || (true && true);
        boolean f = (false || false) && (true && true);

        System.out.println("(101 + 0) / 3) -> " + a);
        System.out.println("(3.0e-6 * 10000000.1) -> " + b);
        System.out.println("(true && true) -> " + c);
        System.out.println("(false && true) -> " + d);
        System.out.println("((false && false) || (true && true)) -> " + e);
        System.out.println("(false || false) && (true && true) -> " + f);
    }
}
