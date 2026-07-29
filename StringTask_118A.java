import java.util.Scanner;

public class StringTask_118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String lower_s = s.toLowerCase();
        char[] low_S = lower_s.toCharArray();
        for (int i = 0; i < low_S.length; i++) {
            if (low_S[i] == 'a' || low_S[i] == 'i' || low_S[i] == 'o' || low_S[i] == 'y' || low_S[i] == 'e'
                    || low_S[i] == 'u') {
                continue;

            }
            System.out.print("." + low_S[i]);

        }
    }

}
