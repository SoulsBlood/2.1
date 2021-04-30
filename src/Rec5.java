import java.util.Scanner;

public class Rec5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n = s.nextInt();
        int number = f(n);
        System.out.println("Fib= " +number);
    }
    public static int f(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else
        {
            return f(n - 1) + f(n - 2);
        }

    }}


