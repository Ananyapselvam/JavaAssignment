import java.util.*;
class GCDLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int a = sc.nextInt();
        System.out.println("Enter num2: ");
        int b = sc.nextInt(), x = a, y = b;
        while (y != 0) {
            int t = y;
            y = x % y;
            x = t;
        }
        int gcd = x;
        int lcm = (a * b) / gcd;
        System.out.println("GCD: " + gcd + " LCM: " + lcm);
    }
}