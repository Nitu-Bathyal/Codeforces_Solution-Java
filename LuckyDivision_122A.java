import java.util.Scanner;

public class LuckyDivision_122A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] lucky = {
                4, 7,
                44, 47, 74, 77,
                444, 447, 474, 477,
                744, 747, 774, 777
        };

        boolean found = false;

        for (int x : lucky) {

            if (n % x == 0) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

// ***APPROACH 2: */
// import java.util.Scanner;

// public class LuckyDivision_122A {

// static boolean isLucky(int n) {

// while (n > 0) {

// int digit = n % 10;

// if (digit != 4 && digit != 7) {
// return false;
// }

// n = n / 10;
// }

// return true;
// }

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();

// for (int i = 1; i <= n; i++) {

// if (isLucky(i) && n % i == 0) {
// System.out.println("YES");
// return;
// }
// }

// System.out.println("NO");
// }
// }