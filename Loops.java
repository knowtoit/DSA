import java.util.*;

public class Loops {

    public static void main(String[] args) {
        // for (int count = 0; count < 3; count++)
        // System.out.println("Hello world!");

        // int i = 0;
        // while (i < 11) {
        // System.out.print(i + " ");
        // i++;
        // }

        // int i = 0;
        // do {
        // System.out.print(i + " ");
        // i++;
        // } while (i < 11);

        // Sum of n natural numbers
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 0; i <= n; i++) {
        // sum = sum + i;
        // }
        // System.out.print(sum + " ");
        // sc.close();

        // table of n number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n * i);
        }
        sc.close();
    }
}
