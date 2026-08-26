import java.util.Scanner;
import java.util.Arrays;

public class Twins_160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        Arrays.sort(coins); // coins are sorted in ascending order
         int count = 0;
    int sum = 0;
    for(int i = 0;i<coins.length;i++)
    {
        sum += coins[i];
    }
    int Mysum = 0;for(
    int i = coins.length - 1;i>=0;i--)
    {
        Mysum += coins[i];
        count++;
        if (Mysum > sum - Mysum) {
            System.out.println(count);
            break;
        }
    }
    }
}