import java.util.Scanner;

public class Hulk_705A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print("I Hate ");
            } else {
                System.out.print("I Love ");
            }
            if (i < n) {
                System.out.print("that ");
            } else {
                System.out.print("it ");
            }
        }

    }
}