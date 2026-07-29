import java.util.Scanner;

public class Problem281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.print(Character.toUpperCase(s.charAt(0)));

        for (int i = 1; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }
}
