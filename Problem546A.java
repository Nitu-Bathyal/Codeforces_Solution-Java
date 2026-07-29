import java.util.Scanner;

public class Problem546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int money;
        int formula = w * (w + 1) / 2;
        int needed_money = k * (formula);
        if (needed_money > n) {
            money = needed_money - n;
        } else {
            money = 0;
        }

        System.out.println(money);

    }

}
