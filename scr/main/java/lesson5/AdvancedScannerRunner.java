package lesson5;

import java.util.Scanner;

public class AdvancedScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, число: ");
        while (!scanner.hasNextInt()){
            String text = scanner.next();
            System.out.print("Ожидается целое значение, а Вы ввели: " + text);
        }
        int index = scanner.nextInt();
        System.out.println("Вы ввели: " + index);
    }
}
