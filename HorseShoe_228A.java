
//***METHOD 1: BRUTE FORCE  */
//Space = O[n], time = O[n^2]
import java.util.Scanner;

public class HorseShoe_228A{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] color = new int[4];

        for (int i = 0; i < 4; i++) {
            color[i] = sc.nextInt();
        }

        int unique = 0;

        for (int i = 0; i < 4; i++) {

            boolean alreadySeen = false;

            for (int j = 0; j < i; j++) {
                if (color[i] == color[j]) {
                    alreadySeen = true;
                    break;
                }
            }

            if (!alreadySeen) {
                unique++;
            }
        }

        System.out.println(4 - unique);
    }
}

// METHOD 2: HASHSET METHOD : CONTAINS ONLY UNIQUE VALUES;
// Time= O[n] average , Space = O[n]
import java.util.Scanner;
import java.util.HashSet;

public class HorseShoe_228A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> color = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            color.add(sc.nextInt());
        }
        int answer = 4 - color.size();
        System.out.println(answer);
    }
}