import java.util.*;
class RevInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) {
            int d = n % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                System.out.println(0);
                return;
            }
            rev = rev * 10 + d;
            n /= 10;
        }
        System.out.println(rev);
    }
}