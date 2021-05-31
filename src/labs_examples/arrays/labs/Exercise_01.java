package labs_examples.arrays.labs;
import java.util.Scanner;
/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter a number: ");
            a[i] = s.nextInt();
        }
        int sum = 0;
        for(int j = 0; j < a.length; j++){
            sum += a[j];
        }
        System.out.println("The sum of the 10 numbers you entered are: " + sum);
        sum = sum/10;
        System.out.println("The average of the 10 number you entered is: " + sum);
    }
}