
public class Main {
    public static void printMax( double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i <  numbers.length; i++)
            if (numbers[i] >  result)
                result = numbers[i];
        System.out.println("The max value is " + result);
    }

        static void myMethod() {
            System.out.println("I just got executed!");

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("here is some changes in Main branch");
        System.out.println("making some changes in this Branch2");
    }
}