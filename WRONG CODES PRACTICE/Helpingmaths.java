
import java.util.*;

public class Helpingmaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '+') {
                System.out.print(arr[i]);

                if (i != arr.length - 1) {
                    System.out.print("+");
                }
            }
        }
    }
}