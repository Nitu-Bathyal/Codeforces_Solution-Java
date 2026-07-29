// import java.util.Scanner;

// public class Problem112A {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String first = sc.next();
//         String second = sc.next();
//         String First_string = first.toLowerCase();
//         String Second_string = second.toLowerCase();
//         char[] arrone = First_string.toCharArray();
//         char[] arrsecond = Second_string.toCharArray();
//         int n = arrone.length;

//         for (int i = 0; i < n; i++) {
//             if (arrone[i] < arrsecond[i]) {
//                 System.out.println(-1);
//                 return;
//             }
//             if (arrone[i] > arrsecond[i]) {
//                 System.out.println(1);
//                 return;
//             }

//         }
//         System.out.print(0);

//     }

// }

//*********NEW MEHTOD : COMPARE to */
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