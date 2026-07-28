import java.util.Scanner;

public class Problem1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long width_count = 0;
        long length_count = 0;
        long quotient = n / a;
        width_count = quotient;
        long remainder = n % a;
        if (remainder > 0) {
            width_count++;
        }
        long Lquotient = m / a;
        length_count = Lquotient;
        long Lremainder = m % a;
        if (Lremainder > 0) {
            length_count++;
        }
        System.out.println(width_count * length_count);
    }
}
