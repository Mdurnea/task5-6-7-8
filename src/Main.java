
public class Main {

    public static void methodRankPoints(double points) {
        if (points >= 202.5) {
            System.out.println("Rank:A1");
        }else if (points >= 122.4) {
            System.out.println("Rank:A2");
        }else {
            System.out.println("Rank:A3");
        }
    }
    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
		}
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
        System.out.println("Lowest number is: " + minFunction(87,65));
        System.out.println("making some changes in this Branch2");

        System.out.println("Commit 1 for Branch3");

        System.out.println("Commit 2 for Branch3");

        System.out.println("Commit 3 for Branch3");

    }
}
