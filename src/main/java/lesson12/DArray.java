package lesson12;

import lesson12.exception.MyArrayDataException;
import lesson12.exception.MyArraySizeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DArray {

    private List<List<String>> array;

    public DArray(int n, int m) {
        if (n != 4 || m != 4) {
            throw new MyArraySizeException("Неверный размер массива!");
        }
        this.array = new ArrayList<>(n);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения матрицы: ");
        for (int i = 0; i < n; i++) {
            List<String> values = new ArrayList<>(m);
            this.array.add(values);
            for (int j = 0; j < m; j++) {
                values.add(scanner.next());
            }
        }
    }

    public void print() {
        for (List<String> value : this.array) {
            System.out.println(value);
        }
    }

    public int matrixSum() {
        int sum = 0;
        for (int i = 0; i < this.array.size(); i++) {
            for (int j = 0; j < this.array.get(i).size(); j++) {
                String value = this.array.get(i).get(j);
                if (!value.matches("\\d")) {
                    throw new MyArrayDataException(i, j, "Неверный тип данных в элементе массива!");
                }
                sum += parseInt(value);
            }
        }
        return sum;
    }
}
