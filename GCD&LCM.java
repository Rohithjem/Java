import java.util.Scanner;

public class LCMandGCD {

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of values (N): ");
        int N = sc.nextInt();

        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();

        int gcd = num1;
        int lcm = num1;

        for (int i = 2; i <= N; i++) {
            System.out.print("Enter Number " + i + ": ");
            int num = sc.nextInt();

            gcd = findGCD(gcd, num);
            lcm = findLCM(lcm, num);
        }

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
        
        sc.close();
    }
}
