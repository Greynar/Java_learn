package lesson12;

import java.util.Scanner;

public class ArrayRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива M x N");
        DArray numbers = new DArray(scanner.nextInt(), scanner.nextInt());
        numbers.print();
        System.out.println(numbers.matrixSum());
    }
}
