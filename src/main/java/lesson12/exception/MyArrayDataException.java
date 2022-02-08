package lesson12.exception;

public class MyArrayDataException extends RuntimeException {

    private final int row;
    private final int str;

    public MyArrayDataException(int n, int m, String message) {
        super(message + " Ошибка в строке " + (n + 1) + ", номер элемента: " + (m + 1));
        this.row = n;
        this.str = n;
    }
}
