import java.util.Scanner;

public class SimpleInterestCalculator {

    public static double calculateInterest(double principal, int years, boolean isSenior) {
        double rateOfInterest = isSenior ? 12.0 : 10.0;
        return (principal * years * rateOfInterest) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();

        System.out.print("Is customer a senior citizen (y/n): ");
        char seniorCitizen = sc.next().charAt(0);

        boolean isSenior = (seniorCitizen == 'y' || seniorCitizen == 'Y');

        double interest = calculateInterest(principal, years, isSenior);

        System.out.println("Interest: " + interest);

        sc.close();
    }
}
