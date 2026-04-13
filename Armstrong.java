import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int t = n, s = 0, d = (""+n).length();
        while (t > 0) {
            int r = t % 10, p = 1;
            for (int i = 0; i < d; i++) p *= r; // manual power
            s += p;
            t /= 10;
        }
        System.out.println(s == n ? "Armstrong" : "Not Armstrong");
    }
}