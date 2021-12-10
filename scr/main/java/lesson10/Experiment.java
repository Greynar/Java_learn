package lesson10;

import java.util.Scanner;

public class Experiment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите начальные единицы измерения температуры:\n1. Градусы Цельсия\n2. Градусы Фаренгейта\n3. Кельвины");
        Converter converter = new Converter(scanner.nextInt());
        converter.temperatureConverter();
    }
}
