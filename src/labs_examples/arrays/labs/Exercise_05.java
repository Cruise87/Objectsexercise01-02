package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
public static void main(String[] args){
    int[] arr = new int[16];
    for(int i = 0; i < arr.length; i++){
       arr[i] = i;
    }
    for(int i : arr){
        System.out.print(i +"    ");
    }
    System.out.println();
    for(int j = arr.length; j >0; j--){
        j--;
        System.out.print(j + "   ");
    }
}
}
