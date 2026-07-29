import java.util.Scanner;

public class Problem996A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bills = { 100, 20, 10, 5, 1 };
        int num_bills = 0;
        for (int i = 0; i < bills.length; i++) {
            int quotient = n / bills[i];
            n = n % bills[i];
            num_bills += quotient;
        }
        System.out.println(num_bills);

    }

}
