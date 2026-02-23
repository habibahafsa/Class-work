import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        long fact = 1;   // using long to handle bigger numbers

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }

            System.out.println("Factorial = " + fact);
        }

        sc.close();
    }
}