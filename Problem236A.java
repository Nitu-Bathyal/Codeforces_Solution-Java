import java.util.Scanner;

public class Problem236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        username = username.toLowerCase();
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (username.charAt(i) == username.charAt(j)) {
                    break;
                }
            }
            if (i == j) {
                count++;
            }
        }
        if (count % 2 == 0) {
            System.out.print("CHAT WITH HER!");

        } else {
            System.out.print("IGNORE HIM!");
        }
    }
}
