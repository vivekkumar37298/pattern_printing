import java.util.Scanner;

class Inv_Parallelogram_Star {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number or rows :");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
