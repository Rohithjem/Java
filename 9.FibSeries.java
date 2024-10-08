import java.util.Scanner;

public class EvenFibonacciSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int a = 0, b = 1;
        int sum = 0;

        while (b <= N) {
            if (b % 2 == 0) {
                sum += b;
            }
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Even sum of Fibonacci series till " + N + " is: " + sum);

        sc.close();
    }
}
