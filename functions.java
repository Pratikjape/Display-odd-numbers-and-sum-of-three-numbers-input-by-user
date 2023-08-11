import java.util.*;

class functions {

    public static int calculate_avg(int a, int b, int c) {

        int sum = a + b + c;
        int avg = sum / 3;

        return avg;

    }

    /*
     * public static void main(String[] args) {
     * 
     * Scanner sc = new Scanner(System.in);
     * System.out.println("enter first number: ");
     * int n = sc.nextInt();
     * 
     * 
     * // System.out.println("enter second number: ");
     * // int b = sc.nextInt();
     * // System.out.println("enter first number: ");
     * // int c = sc.nextInt();
     * 
     * // System.out.println("the average is : " + calculate_avg(a, b, c));
     * 
     * // System.out.println(i);
     */

    public static void displayOddNumbers(int n) {
        System.out.println("Odd numbers from 1 to " + n + ": ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a new line after displaying the numbers
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n = sc.nextInt();
        System.out.println("enter first number: ");
        int a = sc.nextInt();
        System.out.println("enter second number: ");
        int b = sc.nextInt();
        System.out.println("enter first number: ");
        int c = sc.nextInt();

        displayOddNumbers(n);
        System.out.println("the average is : " + calculate_avg(a, b, c));

    }
}
