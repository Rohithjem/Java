import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = sc.nextLine();
        int count = 0;

        System.out.println("Special characters:");
        for (char ch : line.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.out.print(ch + " ");
                count++;
            }
        }

        System.out.println("\nNumber of special characters: " + count);
        sc.close();
    }
}
