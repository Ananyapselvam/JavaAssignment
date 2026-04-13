import java.util.*;
class Perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt(), s = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0) s += i;
        System.out.println(s == n ? "Perfect" : "Not Perfect");
    }
}