import java.util.*;

class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // size = n+1
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int slow = a[0], fast = a[0];

        do {
            slow = a[slow];
            fast = a[a[fast]];
        } while (slow != fast);

        slow = a[0];
        while (slow != fast) {
            slow = a[slow];
            fast = a[fast];
        }

        System.out.println(slow);
    }
}
