import java.util.Scanner;

public class CompositeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();

        System.out.println("Composite numbers between " + a + " and " + b + ":");
        for (int i = a; i <= b; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    public static boolean isComposite(int num) {
        if (num < 4) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return true;
        }
        return false;
    }
}
