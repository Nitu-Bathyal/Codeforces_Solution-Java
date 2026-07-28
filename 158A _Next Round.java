// import java.util.Scanner;

// public class Problem158A {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int[] scores = new int[n];
//         for (int i = 0; i < n; i++) {
//             scores[i] = sc.nextInt();
//         }
//         int cutoff = scores[k - 1];
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             if (scores[i] >= cutoff && scores[i] > 0) {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

//***************NEW METHOD : COMPARE TO METHOD */
import java.util.Scanner;

public class Problem112A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String first = sc.next().toLowerCase();
        String second = sc.next().toLowerCase();

        int result = first.compareTo(second);

        if (result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
