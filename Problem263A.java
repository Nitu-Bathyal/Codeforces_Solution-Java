import java.util.Scanner;

public class Problem263A {
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        int row = 0;
        int column = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int num = sc.nextInt();
                if (num == 1) {
                    row = i;
                    column = j;
                }
            }
        }
        // hume wo "1" 3rd Row or 3rd column m rakhna hai :ek dm beech m
        // to we have to calculate the distance between them and add them so
        // that we can find out how many moves it needs.
        // Math.abs() always gives you +ve value
        int moves = Math.abs(row - 3) + Math.abs(column - 3);
        System.out.println(moves);

    }
}
