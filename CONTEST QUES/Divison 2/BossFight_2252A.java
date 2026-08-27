import java.util.Scanner;

public class BossFight_2252A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();   

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            int maxFreq = 0;

            for (int i = 0; i < n; i++) {

                int count = 0;

                for (int j = 0; j < n; j++) {

                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                if (count > maxFreq) {
                    maxFreq = count;
                }
            }
            int others = n - maxFreq;
            if (others >= maxFreq - 1) {
                System.out.println(sum);
            } else {

                System.out.println("Need one more step");
            }
        }
    }
}