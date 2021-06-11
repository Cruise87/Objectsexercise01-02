package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int a = 5;
        int b = 10;
        String one = new String("Knock, knock. Who's there? Mikey. Mikey who? Mikey doesn't fit in the door!!");
        int two = varargs("five", "four", "three", "two", "one");
        System.out.println("a*b= " + multiply(a,b));
        System.out.println("a/b= " + divide(a,b));
        joke(one);
        System.out.println("the number of strings are in two are: " + two);


    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
        public static int multiply(int a, int b){
        return a*b;
        }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
        public static double divide(int a, int b){
        return a/b;
        }

    // 3) Create a static void method that will print of joke of your choice to the console
        public static void joke(String s){
        System.out.println(s);
        }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
        public static double yearToSeconds(int years){
        double d =  years/365/24/60/60;
        return d;
        }

    // 5) Create a varargs method that will return the length of the varargs array passed in

        public static int varargs(String... args){
        int count = 0;
        for(String s : args){
            count++;
        }
        return count;
        }




}
