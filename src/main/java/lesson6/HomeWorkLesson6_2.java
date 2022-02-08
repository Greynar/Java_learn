package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkLesson6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите номер члена последовательности Фибоначчи: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int n = scanner.nextInt();
        if (n >= 0) {
            int[] fib = new int[n + 1];
            System.out.println(Arrays.toString(arrayFilling(fib)));
            System.out.println(fib[n]);
            int arrLen = fib.length;
            do {
                while (!scanner.hasNextInt()) {
                    scanner.next();
                    System.out.print("Пожалуйста, введите целое число: ");
                }
                n = scanner.nextInt();
                if (n > 0) {
                    if (arrLen - 1 >= n) {
                        System.out.println(Arrays.toString(fib));
                        System.out.println(fib[n]);
                    } else if (n > arrLen - 1) {
                        int[] fibBig = new int[n + 1];
                        System.arraycopy(fib, 0, fibBig, 0, fib.length);
                        System.out.println(Arrays.toString(arrayAdding(fibBig, arrLen)));
                        System.out.println(fibBig[n]);
                        fib = fibBig;
                        arrLen = fibBig.length;
                    }
                }

            } while (n > 0);
        } else {
            System.out.println("Вы ввели неверное значение");
        }
    }

    public static int[] arrayFilling(int[] arr) {
        arr[0] = 0;
        if (arr.length >= 2) {
            arr[1] = 1;
            int temp = 0;
            int result = 1;
            for (int i = 2; i < arr.length; i++) {
                result += temp;
                temp = result - temp;
                arr[i] = result;
            }
        }
        return arr;
    }

    public static int[] arrayAdding(int[] arr, int n) {
        arr[1] = 1;
        int temp = arr[n - 2];
        int result = arr[n - 1];
        for (int i = n; i < arr.length; i++) {
            result += temp;
            temp = result - temp;
            arr[i] = result;
        }
        return arr;
    }


}
