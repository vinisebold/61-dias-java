package java_basics.basic_exercises_part_I;

/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/
public class Exer013 {
    public static void main(String[] args) {
        final double WIDTH = 5.6;
        final double HEIGHT = 8.5;

        double area = WIDTH * HEIGHT;
        double perimeter = 2 * (WIDTH + HEIGHT);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", WIDTH, HEIGHT, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f \n", WIDTH, HEIGHT, perimeter);

    }
}

