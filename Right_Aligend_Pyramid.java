import java.util.Scanner;

class Right_Aligend_Pyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
