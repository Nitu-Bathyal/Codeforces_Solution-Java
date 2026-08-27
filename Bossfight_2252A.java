import java.util.Scanner;
import java.util.HashMap;

public class Bossfight_2252A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                
                HashMap<Integer, Integer> freq = new HashMap<>();
                long totalSum = 0;

                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
                    totalSum += arr[i];
                }
                int maxVal = arr[0];
                int maxFreq = 0;
                for (int val : freq.keySet()) {
                    int count = freq.get(val);
                    if (count > maxFreq) {
                        maxFreq = count;
                        maxVal = val;
                    }
                }

                int otherCount = n - maxFreq;

                if (maxFreq <= otherCount + 1) {
                    System.out.println(totalSum);
                } else {
    
                    long otherSum = 0;
                    for (int x : arr) {
                        if (x != maxVal) {
                            otherSum += x;
                        }
                    }
                    long usableMaxCards = otherCount + 2;
                    long ans = otherSum + usableMaxCards * (long) maxVal;
                    System.out.println(ans);
                }
            }
        }
        sc.close();
    }
}