import java.util.Scanner;

public class Problem231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int petya = sc.nextInt();
            int vasya = sc.nextInt();
            int Tanya = sc.nextInt();
            int sum = petya + vasya + Tanya;
            if (sum >= 2) {
                count++;
            }

        }
        System.out.println(count);
        sc.close();

    }

}
