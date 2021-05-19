package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double radius = 3.14;
        int height = 5;
        double pi = 3.14;
        System.out.println("The volume of a cylinder with radius of 3.14 and a height of 5 is: " + pi*radius*radius*height);
        System.out.println("The surface area of a cylinder with radius of 3.14 and a height of 5 is: " + ((2*pi*radius*height)+(2*pi*radius*radius)));
    }
}