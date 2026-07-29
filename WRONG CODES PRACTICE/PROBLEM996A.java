import java.util.Scanner;

public class PROBLEM996A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bills = { 100, 20, 10, 5, 1 };
        int num_bills = 0;
        for (int i = 0; i < bills.length; i++) {
            int quotient = n / bills[i];
            num_bills = quotient;
            int remainder = n % bills[i];
            int next_num = remainder / bills[i + 1];
            num_bills = quotient + next_num;
            if (i >= bills.length) {
                break;
            }
        }
        System.out.println(num_bills);

    }

}
