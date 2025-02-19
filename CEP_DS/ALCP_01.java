import java.util.*;
public class ALCP_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0;
        for (int i = n; i <= m; i++) {
            int count = 1;
            int num = i;
            while (num != 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = 3 * num + 1;
                }
                count++;
                // System.out.print(num + " ");
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.printf("%d %d %d", n, m, max);
    }
}
