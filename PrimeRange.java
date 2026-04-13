import java.util.*;
public class PrimeRange {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(), c = 0;
        for (int i = 2; i <= n; i++) {
            int f = 0;
            for (int j = 2; j * j <= i; j++)
                if (i % j == 0) { f = 1; break; }

            if (f == 0) {
                System.out.print(i + " ");
                c++;
            }
        }
        System.out.println("\nCount: " + c);
    }
}