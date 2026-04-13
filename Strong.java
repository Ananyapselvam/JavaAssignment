import java.util.*;
public class Strong {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);  
        int n = sc.nextInt(), t = n, s = 0;
        while (t > 0) {
            int r = t % 10, f = 1;
            for (int i = 1; i <= r; i++) f *= i; 
            s += f;
            t /= 10;
        }
        System.out.println(s == n ? "Strong" : "Not Strong");
    }
}
