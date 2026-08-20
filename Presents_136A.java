
// import java.util.*;
// public class Presents_136A {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         /**METHOD 1:ARRAY */
//         int[] answer = new int[n+1];
//         for(int i=1;i<=n;i++){
//             int p=sc.nextInt();
//              answer[p]=i;
//         }
//         for (int i =1;i<=n;i++){
//             System.out.print(answer[i]+" ");
//         }
//     }

// }

//MEthod 2: HASH MAP**
import java.util.HashMap;
import java.util.Scanner;

public class Presents_136A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> answer = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int p = sc.nextInt();
            answer.put(p, i);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(answer.get(i) + " ");
        }

    }
}

;