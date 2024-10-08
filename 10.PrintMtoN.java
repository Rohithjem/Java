import java.util.Scanner;

public class SkipNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of M: ");
        int M = sc.nextInt();

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        System.out.print("Enter the value of K: ");
        int K = sc.nextInt();

        for (int i = M; i <= N; i += (K + 1)) {
            System.out.print(i);
            if (i + (K + 1) <= N) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
