
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
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("here is some changes in Main branch");
        System.out.println("Lowest number is: "+minFunction(87,65));

    }
}