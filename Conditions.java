import java.util.*;

public class Conditions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("The numbers are equal");
        } else if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }

        sc.close();
        ;

    }
}

// if-else condition
// 1. Code to check if age is greater than 18 or not

// Scanner sc = new Scanner(System.in);
// int age = sc.nextInt();

// if (age > 18) {
// System.out.println("You are an adult");
// } else {
// System.out.println("You are a minor");
// }

// sc.close();

// 2. Another example of if-else condition
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();

// if (a % 2 == 0) {
// System.out.println("Even");
// } else {
// System.out.println("odd");
// }

// sc.close();