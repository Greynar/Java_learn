package lesson4;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        System.out.println("Число " + squareRoot(n) + " является корнем числа " + n);
    }

    public static double squareRoot(int num) {
        double t;
        double sqrtroot = num / 2;
        do {
            t = sqrtroot;
            sqrtroot = (t + (num / t)) / 2;
        }
        while ((t - sqrtroot) != 0);
        return sqrtroot;
    }
}