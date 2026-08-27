import java.util.Scanner;

public class iLoveUsername_155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int high = scores[0];
        int low = scores[0];
        int count = 0;
        for (int i = 1; i < scores.length; i++) {

            if (low > scores[i]) {
                count++;
                low = scores[i];

            }
            if (high < scores[i]) {
                count++;
                high = scores[i];

            }

        }
        System.out.println(count);

    }
}
