package labs_examples.conditions_loops.labs;

import java.sql.SQLOutput;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            System.out.println("i is: " + i);
            if(i == 50)
                break;
        }
    }
}
