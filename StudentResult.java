import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int mark = sc.nextInt();

        if (mark >= 80) {
            System.out.println("Grade A+");
        } 
        else if (mark >= 70) {
            System.out.println("Grade A");
        } 
        else if (mark >= 60) {
            System.out.println("Grade B");
        } 
        else {
            System.out.println("Fail");
        }

        sc.close();
    }
}