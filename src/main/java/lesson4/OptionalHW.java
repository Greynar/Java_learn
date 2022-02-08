package lesson4;

import java.util.Scanner;

public class OptionalHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, из которого необходимо извлечь корень: ");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Пожалуйста, введите число!");
        }
        int number = scanner.nextInt();
        System.out.println(sqrt(number));
    }

    public static int sqrt(int numb){
        for (int i = 0; i < numb; i++) {
            if (i * i == numb){
                return i;
            }
        }
        System.out.println("Искомое значение не являтся целым числом");
        return -1;
    }
}
