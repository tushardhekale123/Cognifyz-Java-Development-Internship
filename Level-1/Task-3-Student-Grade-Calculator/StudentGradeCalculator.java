import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Grade Calculator =====");

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of Subject " + i + ": ");
            total += sc.nextDouble();
        }

        double average = total / n;

        System.out.println("----------------------------");
        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);

        if (average >= 90)
            System.out.println("Grade = A+");
        else if (average >= 80)
            System.out.println("Grade = A");
        else if (average >= 70)
            System.out.println("Grade = B");
        else if (average >= 60)
            System.out.println("Grade = C");
        else if (average >= 50)
            System.out.println("Grade = D");
        else
            System.out.println("Grade = F");

        sc.close();
    }
}