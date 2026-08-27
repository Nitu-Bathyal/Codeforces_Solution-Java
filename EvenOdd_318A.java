//   ///**THIS METHOD IS FOR SMALL n Values n<10^12 */
// import java.util.Scanner;

// public class EvenOdd_318A {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int position =0;
//         int[] arr = new int[n+1];
//         for(int i =1;i<=n;i++){
//             if (i%2!=0) {
//                 arr[position] =i; 
//                 position++;  
//             }
            
//         }
//         for(int i=1;i<=n;i++){
//             if(i%2==0){
//                 arr[position]=i;
//             }
//         }
//         System.out.println(arr[k-1]);
//     }
    
// }
   

   //*******METHOD FOR N = 1 TRILLION */


import java.util.Scanner;
 
public class EvenOdd_318A {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        long n = sc.nextLong();
        long k = sc.nextLong();
 
        long odds = (n + 1) / 2;
 
        if (k <= odds) {
            System.out.println(2 * k - 1);
        } else {
            System.out.println(2 * (k - odds));
        }
 
        sc.close();
    }
}























