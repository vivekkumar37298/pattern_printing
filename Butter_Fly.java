import java.util.Scanner;

class Butter_Fly {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Left half
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right half
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int i = n - 1; i >= 1; i--) {
            // Left half
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right half
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}