import java.util.Scanner;

public class DivisibilityPorblem_1328A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a;
        int b;   
        
        //***********FOR THIS LOGIC TIME EXCEEDD 1000 BECOX:
        // IF A=0 AND B = 1000000000000 THEN THE WHILE LOOP WILL RUN TILL 100000000000000 AND 
        // A WILL INCREASE ONE BY ONE  */
        // for (int i = 0; i < t; i++) {
        //     int count =0;
        //     a = sc.nextInt();
        //     b = sc.nextInt();
        //     while (a % b != 0) {
        //         a += 1;
        //         count += 1;
        // }
        // System.out.println(count);
        // }


        // 2ND METHOD:
        for(int i =0; i<t;i++){
            int count =0;
            a=sc.nextInt();
            b=sc.nextInt();
            if(a%b==0){
                count=0;
                System.out.println(count);
            }
            else{
                count = b-(a%b);
                System.out.println(count);
            }
        }
       
    }

}
