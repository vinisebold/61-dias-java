package java_basics.basic_exercises_part_I;

/*
Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/
public class Exer011 {
    public static void main(String[] args) {
        double Area = Math.PI * Math.pow(7.5, 2);
        double Perimeter = Math.PI * 2 * 7.5;

        System.out.println("Perimeter is = " + Perimeter);
        System.out.println("Area = " + Area);
    }
}
