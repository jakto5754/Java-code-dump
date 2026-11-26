import java.util.Scanner;

public class UserAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter your birth month: ");
        int birthMonth = sc.nextInt();

        System.out.print("Enter your birth day: ");
        int birthDay = sc.nextInt();

        int year = 2026;
        int month = 11;
        int day = 25;

        int years = year - birthYear;
        int months = month - birthMonth;
        int days = day - birthDay;

        if (days < 0) {
            months--;
            days += 30;
        }

        if (months < 0) {
            years--;
            months += 12;
        }

        System.out.println("You age is: " + years + " years, "
                + months + " months, " + days + " days.");

        sc.close();
    }
}
