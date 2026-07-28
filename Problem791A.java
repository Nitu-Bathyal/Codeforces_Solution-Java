import java.util.Scanner;

public class Problem791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while (true) {
            if (a > b) {
                break;
            }
            a = 3 * a;
            b = 2 * b;
            count++;
        }
        System.out.println(count);

    }

}
