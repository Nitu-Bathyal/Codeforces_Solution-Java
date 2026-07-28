
import java.util.*;

public class Problem339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // char[] arr = s.toCharArray();
        // split the string whereever "+" appears
        String[] arr = s.split("\\+");
        // sort the numbers
        Arrays.sort(arr);

        // print the sorted numbers with+ sign betweent them
        System.out.println(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("+" + arr[i]);
        }

    }
}
