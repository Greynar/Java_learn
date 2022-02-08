package lesson5;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fibNum;
        System.out.print("Пожалуйста, введите номер члена последовательности Фибоначчи: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Пожалуйста, введите целое число: ");
        }
        fibNum = scanner.nextInt();
        System.out.println(fibonacciNumber(fibNum));
    }

    public static int fibonacciNumber(int number) {//7 = 13
        if (number >= 1) {
            int temp = 0;
            int result = 1;
            for (int i = 1; i < number; i++) {
                result = temp + result;
                temp = result - temp;
            }
            return result;
        } else if (number <= -1) {
            int temp = 0;
            int result = 1;
            for (int i = -1; i > number; i--) {
                result = temp + result;
                temp = result - temp;
            }
            return -result;
        } else {
            return number;
        }
    }
}
