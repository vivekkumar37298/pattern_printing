import java.util.*;

class Hollow_Circle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius :");
        int r = sc.nextInt();
        for (int i = -r; i <= r; i++) {
            for (int j = -r; j <= r; j++) {
                int distance = i * i + j * j;
                if (distance >= r * r - r && distance <= r * r + r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}