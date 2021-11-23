package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkLesson6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Пожалуйста, введите целое число: ");
        }
        int length = scanner.nextInt();
        int[] array = new int[length];
        arrayFilling(array);
        System.out.println("Введенный Вами массив: " + Arrays.toString(array));
        System.out.println("Максимальное значение массива: " + maxValue(array));
        System.out.println("Минимальное значение массива: " + minValue(array));
        System.out.println("Среднее значение массива: " + averageValue(array));
    }

    public static int[] arrayFilling(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101);
        }
        return arr;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    public static double averageValue(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
}
